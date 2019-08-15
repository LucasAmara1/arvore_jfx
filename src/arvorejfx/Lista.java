package arvorejfx;

public class Lista {
    private No inicio;
    private No fim;
            
    public Lista(){
        inicio = null;
        fim = null;
    }

    public No getInicio() {
        return inicio;
    }

    public No getFim() {
        return fim;
    }

    public void setFim(No fim) {
        this.fim = fim;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }
    
    public boolean isEmpty(){
        if(inicio == null && fim == null)
            return true;
        else
            return false;
    }
    
    public No incluir(int e){
        No novo = new No(e);
        if((isEmpty()) || (e < inicio.getInfo())){
            if(isEmpty()) //Se a lista estiver vazia, o No a ser adicionado será tanto o inicio como o fim
                fim = novo;            
            novo.setProx(inicio);
            if(inicio != null) //Trata o null point
                inicio.setPai(novo);
            inicio = novo;
        }else{
            No temp = inicio;
            
            while((temp.getProx()!= null) && (e > temp.getProx().getInfo())){
                temp = temp.getProx();

            }
                novo.setProx(temp.getProx());
                if(temp.getProx() != null){
                    temp.getProx().setPai(novo);
                }else{ // se temp.getProx() == null 
                    fim = novo; // novo será o fim da lista
                }
                temp.setProx(novo);
                novo.setPai(temp);
        }
        return inicio;
    }
    
    public No listaParaArv(No i, Arvore arv){ // Tranforma uma lista ordenada em uma arvore atravês do método da "mediana recursiva"
        if((isEmpty())){
            System.out.println("Lista Vazia!");
        }else{
            if(numNosLista() == 1){
                arv.inserir(arv.getRaiz(), inicio.getInfo());
            }else{
                if( numNosLista() == 2){
                    Lista l1 = new Lista();
                    l1.setInicio(inicio.getProx());
                    l1.setFim(fim);
                    arv.inserir(arv.getRaiz(), inicio.getInfo());
                    l1.listaParaArv(l1.getInicio(), arv);
                }else{
                    if(numNosLista()%2 == 0){
                        int cont = 1;
                        No temp = inicio;
                        while(numNosLista()/2 != cont){
                            temp = temp.getProx();
                            cont++;
                        }
                        Lista l1 = new Lista();
                        Lista l2 = new Lista();
                        l1.setInicio(inicio);
                        l1.setFim(temp.getPai());
                        l2.setInicio(temp.getProx());
                        l2.setFim(fim);
                        arv.inserir(arv.getRaiz(), temp.getInfo());
                        l1.listaParaArv(l1.getInicio(), arv);
                        l2.listaParaArv(l2.getInicio(), arv);
                    }else{
                        int cont = 1;
                        No temp = inicio;
                        while((numNosLista() + 1)/2 != cont){
                            temp = temp.getProx();
                            cont++;
                        }
                        int q = temp.getInfo();
                        Lista l1 = new Lista();
                        Lista l2 = new Lista();
                        l1.setInicio(inicio);
                        l1.setFim(temp.getPai());
                        l2.setInicio(temp.getProx());
                        l2.setFim(fim);                     
                        arv.inserir(arv.getRaiz(), q);
                        l1.listaParaArv(l1.getInicio(), arv);
                        l2.listaParaArv(l2.getInicio(), arv);
                   }
                }
            
            }
        } 
        return arv.getRaiz();
    }
    
    public int numNosLista(){
        int n = 1;
        No temp = inicio;
        while(temp != fim){
            temp = temp.getProx();
            n++;
        }
        return n;
    }
    
    public void imprime(){
        No temp = inicio;
        while(temp != null){
            System.out.println(temp+">");
            temp = temp.getProx();
        }
    }
}//fim
