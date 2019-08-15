package arvorejfx;

import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Amaral
 */
public class Arvore {

    private No raiz;

    public Arvore() {
        this.raiz = null;

    }

    public No getRaiz() {
        return raiz;
    }

    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }

    public boolean isEmpty() {
        return raiz == null;
    }

    public No inserir(No r, int e) {

        if (isEmpty()) {
            No novo = new No(e);
            raiz = novo;
        } else {

            if (numNos(raiz) == 31) { // verifica se a árvore ta cheia pelo número de nós pré-estabelecidos
                JOptionPane.showMessageDialog(null, "Àrvore Cheia");
                return r;
            }
            if (e < r.getInfo()) {
                if (r.getEsq() == null) {
                    No novo = new No(e);
                    r.setEsq(novo);
                    novo.setPai(r);                    
                } else {
                    inserir(r.getEsq(), e);
                }
            } else if (e == r.getInfo()) {
                JOptionPane.showMessageDialog(null, "número já existente na árvore");
            } else {  //se e >= r.getInfo(); 
                if (r.getDir() == null) {
                    No novo = new No(e);
                    r.setDir(novo);
                    novo.setPai(r);                    
                } else {
                    inserir(r.getDir(), e);
                }
            }
        }

        return r;
    }

    public No[] deArvPraVetor(No lista[], No r, int n, int n2) { //Método para criar um vetor no estilo heap para ser usado na interface
        if (r != null && n < 31) {
            lista[n] = r;
            n2 = n;
            if (r.getEsq() != null) {
                n = (2 * n) + 1;
                deArvPraVetor(lista, r.getEsq(), n, 0);
            }
            if (r.getDir() != null) {
                n2 = (2 * n2) + 2;
                deArvPraVetor(lista, r.getDir(), n2, 0);
            }
        }

        return lista;
    }

    public No remove(No r, int n) {
        if (r == null) {
            return null;
        } else {
            if (n < r.getInfo()) {
                r.setEsq(remove(r.getEsq(), n));
            } else {
                if (n > r.getInfo()) {
                    r.setDir(remove(r.getDir(), n));
                } else {
                    if (r.getEsq() == null && r.getDir() == null) {
                        if (r == raiz) {
                            raiz = null;
                        } else {
                            r = null;
                        }
                    } else {
                        if (r.getDir() == null) {
                            No temp = r;
                            r.getEsq().setPai(r.getPai());
                            if (r == raiz) {//Caso o elemento a ser removido seja uma raiz
                                raiz = r.getEsq();
                            } else {
                                r = r.getEsq();
                            }
                            temp = null;
                        } else {
                            if (r.getEsq() == null) {
                                No temp = r;
                                r.getDir().setPai(r.getPai());
                                if (r == raiz) {//Caso o elemento a ser removido seja uma raiz
                                    raiz = r.getDir();
                                } else {
                                    r = r.getDir();
                                }
                                temp = null;
                            } else {
                                No temp = r.getEsq();
                                while (temp.getDir() != null) {
                                    temp = temp.getDir();
                                }
                                r.setInfo(temp.getInfo());
                                temp.setInfo(n);
                                r.setEsq(remove(r.getEsq(), n));
                                //balancAvl(raiz); // balanceamento após remoção
                            }
                        }
                    }
                }
            }
        }

        return r;
    }
    
    public No ArvParalista (No r, Lista l){ //Método que tranforma uma arvore numa lista ordenada
        if(isEmpty()){
            System.out.println("Arvore vazia!");
        }else{
            l.incluir(r.getInfo());
            if(r.getDir() == null && r.getEsq() != null){
                ArvParalista(r.getEsq(), l);
            }else{
                if(r.getEsq() == null && r.getDir() != null){
                    ArvParalista(r.getDir(), l);
                }else{
                    if(r.getEsq() != null && r.getDir() != null){
                        ArvParalista(r.getEsq(), l);
                        ArvParalista(r.getDir(), l);
                    }
                }               
            }    
        }
        return l.getInicio();
    }
     
    public void balancPorLista(){ //Método de balanceamento por Vetor/Lista
        Lista l = new Lista();
        ArvParalista(raiz, l); // Transforma a arvore numa lista ordenada
        Arvore arv = new Arvore(); 
        raiz = l.listaParaArv(l.getInicio(), arv); // Transforma a lista ordenada em uma nova arvore agora balanceada
    }
    
    public void balancAvl(No r) {
        if (isEmpty()) {
            System.out.println("Arvore vazia");
        } else {
            if ((alturaNo(r.getEsq())) - (alturaNo(r.getDir())) == 2) { //FB(fator de balanceamento) de r = 2
                if ((alturaNo(r.getEsq().getEsq())) - (alturaNo(r.getEsq().getDir())) >= 0) { // FB do filho a esquerda de r >= 0
                    rotacaoDir(r);
                } else {
                    if ((alturaNo(r.getEsq().getEsq())) - (alturaNo(r.getEsq().getDir())) <= 0) { // FB do filho a esquerda de r <= 0
                        rotacaoEsq(r.getEsq());
                        rotacaoDir(r);
                    }
                }
            } else {
                if ((alturaNo(r.getEsq())) - (alturaNo(r.getDir())) == -2) { //FB de r = -2
                    if ((alturaNo(r.getDir().getEsq())) - (alturaNo(r.getDir().getDir())) <= 0) { // FB do filho a direita de r <= 0
                        rotacaoEsq(r);
                    } else {
                        if ((alturaNo(r.getDir().getEsq())) - (alturaNo(r.getDir().getDir())) >= 0) { // FB do filho a direita de r >= 0
                            rotacaoDir(r.getDir());
                            rotacaoEsq(r);
                        }
                    }
                }
            }
        }
    }

    public int alturaNo(No r) {
        if (r == null) {
            return -1;
        } else {
            if (r.getEsq() == null && r.getDir() == null) {
                return 0;
            } else if (r.getDir() == null) {
                return alturaNo(r.getEsq()) + 1;

            } else if (r.getEsq() == null) {
                return alturaNo(r.getDir()) + 1;
            } else {
                return Math.max(alturaNo(r.getEsq()), alturaNo(r.getDir())) + 1;
            }
        }
    }

    public void rotacaoDir(No r) {
        No q, temp;
        q = r.getEsq();
        temp = q.getDir();
        q.setDir(r);
        q.setPai(r.getPai()); // muda o pai de q
        if (q.getPai() != null) { // evita null point
            q.getPai().setDir(q); // muda a Dir do pai de q de r para q
        }
        r.setPai(q); // muda o pai de r
        r.setEsq(temp);
        if (temp != null) { // evita o null point
            temp.setPai(r); // muda o pai de temp
        }
        if (r == raiz) {
            raiz = q;
        }
    }

    public void rotacaoEsq(No r) {
        No q, temp;
        q = r.getDir();
        temp = q.getEsq();
        q.setEsq(r);
        q.setPai(r.getPai()); // muda o pai de q
        if (q.getPai() != null) { // evita null point
            q.getPai().setEsq(q); // muda a Esq do pai de q de r para q
        }
        r.setPai(q); // muda o pai de r
        r.setDir(temp);
        if (temp != null) { // evita o null point
            temp.setPai(r); // muda o pai de temp
        }
        if (r == raiz) { // Quando r for a raiz
            raiz = q; // q é a nova raiz
        }
    }

    public int somaNos(No r) {
        int soma = 0;
        if (isEmpty()) {
            return soma;
        } else {
            if (r.getDir() == null && r.getEsq() != null) {
                soma = r.getInfo() + somaNos(r.getEsq());
            } else {
                if (r.getEsq() == null && r.getDir() != null) {
                    soma = r.getInfo() + somaNos(r.getDir());
                } else {
                    if (r.getEsq() != null && r.getDir() != null) {
                        soma = r.getInfo() + somaNos(r.getEsq()) + somaNos(r.getDir());
                    } else {
                        soma = r.getInfo();
                    }
                }
            }
        }
        return soma;
    }

    public int numNos(No r) {
        int i = 0;
        if (isEmpty()) {
            return i;
        } else {
            if (r.getDir() == null && r.getEsq() != null) {
                i = numNos(r.getEsq()) + 1;
            } else {
                if (r.getEsq() == null && r.getDir() != null) {
                    i = numNos(r.getDir()) + 1;
                } else {
                    if (r.getEsq() != null && r.getDir() != null) {
                        i = numNos(r.getDir()) + numNos(r.getEsq()) + 1;
                    } else {
                        return 1;
                    }
                }
            }
        }
        return i;
    }

    public No removeMax(No r) {
        if (isEmpty()) {
            return null;
        } else {
            if (r.getDir() != null) {
                r = removeMax(r.getDir());
            } else {
                remove(raiz, r.getInfo());
            }
        }
        return r;
    }

    public int pfdDoMin(No r) { // Profundidade do menor nó
        int n = 0;
        if (isEmpty()) {
            return -1;
        } else {
            if (r.getEsq() != null) {
                n = pfdDoMin(r.getEsq()) + 1;
            } else {
                return n;
            }
        }
        return n;
    }

    public void imprime(No r) {
        if (r != null) {
            imprime(r.getEsq());
            System.out.println(r);
            imprime(r.getDir());
        }
    }

    public void emOrdem(No r) {  //imprime em ordem
        if (r != null) {
            emOrdem(r.getEsq());
            System.out.println(r.getInfo());
            emOrdem(r.getDir());
        }
    }

    public void preOrdem(No r) { //imprime em ordem pré ordem
        if (r != null) {
            System.out.println(r.getInfo());
            preOrdem(r.getEsq());
            preOrdem(r.getDir());
        }
    }

    public void posOrdem(No r) { //imprime em pos ordem
        if (r != null) {
            posOrdem(r.getEsq());
            posOrdem(r.getDir());
            System.out.println(r.getInfo());
        }
    }
}
