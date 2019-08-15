package arvorejfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class FXMLDocumentController implements Initializable {

    //Instanciando Circles(Nós)
    @FXML
    private Circle c0;
    @FXML
    private Circle c1;
    @FXML
    private Circle c2;
    @FXML
    private Circle c3;
    @FXML
    private Circle c4;
    @FXML
    private Circle c5;
    @FXML
    private Circle c6;
    @FXML
    private Circle c7;
    @FXML
    private Circle c8;
    @FXML
    private Circle c9;
    @FXML
    private Circle c10;
    @FXML
    private Circle c11;
    @FXML
    private Circle c12;
    @FXML
    private Circle c13;
    @FXML
    private Circle c14;
    @FXML
    private Circle c15;
    @FXML
    private Circle c16;
    @FXML
    private Circle c17;
    @FXML
    private Circle c18;
    @FXML
    private Circle c19;
    @FXML
    private Circle c20;
    @FXML
    private Circle c21;
    @FXML
    private Circle c22;
    @FXML
    private Circle c23;
    @FXML
    private Circle c24;
    @FXML
    private Circle c25;
    @FXML
    private Circle c26;
    @FXML
    private Circle c27;
    @FXML
    private Circle c28;
    @FXML
    private Circle c29;
    @FXML
    private Circle c30;

    //Instanciando Labels(Infos)
    @FXML
    private Label lbl0;
    @FXML
    private Label lbl1;
    @FXML
    private Label lbl2;
    @FXML
    private Label lbl3;
    @FXML
    private Label lbl4;
    @FXML
    private Label lbl5;
    @FXML
    private Label lbl6;
    @FXML
    private Label lbl7;
    @FXML
    private Label lbl8;
    @FXML
    private Label lbl9;
    @FXML
    private Label lbl10;
    @FXML
    private Label lbl11;
    @FXML
    private Label lbl12;
    @FXML
    private Label lbl13;
    @FXML
    private Label lbl14;
    @FXML
    private Label lbl15;
    @FXML
    private Label lbl16;
    @FXML
    private Label lbl17;
    @FXML
    private Label lbl18;
    @FXML
    private Label lbl19;
    @FXML
    private Label lbl20;
    @FXML
    private Label lbl21;
    @FXML
    private Label lbl22;
    @FXML
    private Label lbl23;
    @FXML
    private Label lbl24;
    @FXML
    private Label lbl25;
    @FXML
    private Label lbl26;
    @FXML
    private Label lbl27;
    @FXML
    private Label lbl28;
    @FXML
    private Label lbl29;
    @FXML
    private Label lbl30;

    //Instanciando Lines(arestas)
    @FXML
    private Line l1;
    @FXML
    private Line l2;
    @FXML
    private Line l3;
    @FXML
    private Line l4;
    @FXML
    private Line l5;
    @FXML
    private Line l6;
    @FXML
    private Line l7;
    @FXML
    private Line l8;
    @FXML
    private Line l9;
    @FXML
    private Line l10;
    @FXML
    private Line l11;
    @FXML
    private Line l12;
    @FXML
    private Line l13;
    @FXML
    private Line l14;
    @FXML
    private Line l15;
    @FXML
    private Line l16;
    @FXML
    private Line l17;
    @FXML
    private Line l18;
    @FXML
    private Line l19;
    @FXML
    private Line l20;
    @FXML
    private Line l21;
    @FXML
    private Line l22;
    @FXML
    private Line l23;
    @FXML
    private Line l24;
    @FXML
    private Line l25;
    @FXML
    private Line l26;
    @FXML
    private Line l27;
    @FXML
    private Line l28;
    @FXML
    private Line l29;
    @FXML
    private Line l30;

    //Adiciona as Lines no vetor de Lines e retorna o vetor
    public Line[] listaLine() {
        Line ls[] = new Line[31];

        ls[1] = l1;
        ls[2] = l2;
        ls[3] = l3;
        ls[4] = l4;
        ls[5] = l5;
        ls[6] = l6;
        ls[7] = l7;
        ls[8] = l8;
        ls[9] = l9;
        ls[10] = l10;
        ls[11] = l11;
        ls[12] = l12;
        ls[13] = l13;
        ls[14] = l14;
        ls[15] = l15;
        ls[16] = l16;
        ls[17] = l17;
        ls[18] = l18;
        ls[19] = l19;
        ls[20] = l20;
        ls[21] = l21;
        ls[22] = l22;
        ls[23] = l23;
        ls[24] = l24;
        ls[25] = l25;
        ls[26] = l26;
        ls[27] = l27;
        ls[28] = l28;
        ls[29] = l29;
        ls[30] = l30;

        return ls;
    }

    //Adiciona os Circles no vetor de Circles e retorna o vetor
    public Circle[] listaCirc() {
        Circle cs[] = new Circle[31];
        cs[0] = c0;
        cs[1] = c1;
        cs[2] = c2;
        cs[3] = c3;
        cs[4] = c4;
        cs[5] = c5;
        cs[6] = c6;
        cs[7] = c7;
        cs[8] = c8;
        cs[9] = c9;
        cs[10] = c10;
        cs[11] = c11;
        cs[12] = c12;
        cs[13] = c13;
        cs[14] = c14;
        cs[15] = c15;
        cs[16] = c16;
        cs[17] = c17;
        cs[18] = c18;
        cs[19] = c19;
        cs[20] = c20;
        cs[21] = c21;
        cs[22] = c22;
        cs[23] = c23;
        cs[24] = c24;
        cs[25] = c25;
        cs[26] = c26;
        cs[27] = c27;
        cs[28] = c28;
        cs[29] = c29;
        cs[30] = c30;

        return cs;
    }

    //Adiciona as Labels no vetor de Labels e retorna o vetor
    public Label[] listaLbl() {
        Label lbls[] = new Label[31];
        lbls[0] = lbl0;
        lbls[1] = lbl1;
        lbls[2] = lbl2;
        lbls[3] = lbl3;
        lbls[4] = lbl4;
        lbls[5] = lbl5;
        lbls[6] = lbl6;
        lbls[7] = lbl7;
        lbls[8] = lbl8;
        lbls[9] = lbl9;
        lbls[10] = lbl10;
        lbls[11] = lbl11;
        lbls[12] = lbl12;
        lbls[13] = lbl13;
        lbls[14] = lbl14;
        lbls[15] = lbl15;
        lbls[16] = lbl16;
        lbls[17] = lbl17;
        lbls[18] = lbl18;
        lbls[19] = lbl19;
        lbls[20] = lbl20;
        lbls[21] = lbl21;
        lbls[22] = lbl22;
        lbls[23] = lbl23;
        lbls[24] = lbl24;
        lbls[25] = lbl25;
        lbls[26] = lbl26;
        lbls[27] = lbl27;
        lbls[28] = lbl28;
        lbls[29] = lbl29;
        lbls[30] = lbl30;

        return lbls;
    }

    @FXML
    private Button btnAddNo; //Instância do Button add
    @FXML
    private TextField tfNoAdd; //Instância do TextField add

    @FXML
    private Button btnRmvNo; //Instância do Button remove
    @FXML
    private TextField tfNoRmv; //Instância do TextField remove
    
    @FXML
    private Button btnNoBlc; //Instância do Button add
    @FXML
    private TextField tfNoBlc; //Instância do TextField add
    
    Arvore arv = new Arvore();

    @FXML
    private void addNo(ActionEvent event) { //Add um Nó na árvore

        No[] lista = new No[31]; //Cria um vetor de Nós
        int n = Integer.parseInt(tfNoAdd.getText());
        
        try{
        //bloco para tratamento de erro quando não houver posição no vetor
        arv.inserir(arv.getRaiz(), Integer.parseInt(tfNoAdd.getText())); //Chama o método Inserir de Arvore. Parâmetros: raiz da arvore e número digitado no TextFildd
        }catch(NumberFormatException nf){
            JOptionPane.showMessageDialog(null, "insira um número com formato correto");                   
        }
        
        tfNoAdd.clear(); //Limpa o TextField
        lista = arv.deArvPraVetor(lista, arv.getRaiz(), 0, 0); ////Vetor de Nós é preenchido pelo retornbo do método deArvPraVetor da classe Arvore que retorna um vetor de Nós no estilo "caminhamento heap"
        
        //Evita que a arvore tenha mais de 5 níveis
        for (int i = 15; i < 31; i++){
            if((lista[i]) != null && (lista[i].getEsq() != null || lista[i].getDir() != null)){ //Se os Nós de 15 a 30 tiverem filhos a árvore excedo os 5 níveis possíveis
                JOptionPane.showMessageDialog(null, "Você excedeu o numero de níveis da árvore, esse Nó não será inserido");
                arv.remove(arv.getRaiz(), n); // remoção do Nó no nível 6
                lista = arv.deArvPraVetor(lista, arv.getRaiz(), 0, 0); //Um novo vetor com os Nós da arvore com 5 níveis é criado
            }
        }

        for (int i = 0; i < 31; i++) { //Esse for percorre todo o vetor de Nós
            if (lista[i] != null) { //Se o Nó na posição i do vetor for diferente de null
                listaCirc()[i].setVisible(true); //Mostra o Circle correspondente ao Nó na posição i do vetor
                listaLbl()[i].setText(Integer.toString(lista[i].getInfo())); //Escreve o Info do Nó da posição i do vetor na Label correspondente
                listaLbl()[i].setVisible(true); //Mostra a Label correspondente ao Nó da posição i do vetor
                if (i != 0) {//Impede que o execução tente escrever a l0 que não existe
                    listaLine()[i].setVisible(true); //Mostra a Line correspondente ao Nó da posição i do vetor
                }
            }
        }       
    

    }

    @FXML
    private void removeNo(ActionEvent event) { //Remove um Nó da arvore
        No[] lista = new No[31]; //Cria um vetor de Nós
        try{
        arv.remove(arv.getRaiz(), Integer.parseInt(tfNoRmv.getText())); //Chama o método remove de Arvore. Parâmetros: raiz da arvore e número digitado no TextFildd
        }catch(NumberFormatException nf){
            JOptionPane.showMessageDialog(null, "insira um número com formato correto");                   
        }
        tfNoRmv.clear(); //Limpa o TextField
        lista = arv.deArvPraVetor(lista, arv.getRaiz(), 0, 0); //Vetor de Nós é preenchido pelo retornbo do método deArvPraVetor da classe Arvore que retorna um vetor de Nós no estilo "caminhamento heap"
        for (int i = 0; i < 31; i++) { //Esse for percorre todo o vetor de Nós
            if (lista[i] != null) { //Se o Nó na posição i do vetor for diferente de null
                listaCirc()[i].setVisible(true); //Mostra o Nó(Circle correspondente) na tela
                listaLbl()[i].setText(Integer.toString(lista[i].getInfo())); //Modifica o texto da Label correspondente para o valor(info) do Nó
                listaLbl()[i].setVisible(true); //Escreve a Label na tela
                if (i != 0) { //Impede que o execução tente escrever a l0 que não existe
                    listaLine()[i].setVisible(true); //Esvrece a linha correspondente ao Nó da posição i na tela
                }
            } else { //Caso o Nó na posição i seja null
                try {
                    listaCirc()[i].setVisible(false); //Apaga o Circle correspondente ao Nó 
                    listaLbl()[i].setText(null); //Apaga o texto da Label(info do Nó) correspondente ao Nó 
                    listaLbl()[i].setVisible(false); //Apaga a Label correspondente ao Nó 
                    listaLine()[i].setVisible(false); //Apaga a Line correspondente ao Nó 
                } catch (NullPointerException np) {
                   JOptionPane.showMessageDialog(null, "a árvore está vazia");                   
                }

            }
        }
    }
    
    @FXML
    private void balancear(ActionEvent event) { //Balanceia a árvore
        No[] lista = new No[31]; //Cria um vetor de Nós
        arv.balancPorLista(); //Chama o método de balanceamento por lista
        lista = arv.deArvPraVetor(lista, arv.getRaiz(), 0, 0); ////Vetor de Nós é preenchido pelo retornbo do método deArvPraVetor da classe Arvore que retorna um vetor de Nós no estilo "caminhamento heap"
        for (int i = 0; i < 31; i++) { //Esse for percorre todo o vetor de Nós
            if (lista[i] != null) { //Se o Nó na posição i do vetor for diferente de null
                listaCirc()[i].setVisible(true); //Mostra o Nó(Circle correspondente) na tela
                listaLbl()[i].setText(Integer.toString(lista[i].getInfo())); //Modifica o texto da Label correspondente para o valor(info) do Nó
                listaLbl()[i].setVisible(true); //Escreve a Label na tela
                if (i != 0) { //Impede que o execução tente escrever a l0 que não existe
                    listaLine()[i].setVisible(true); //Esvrece a linha correspondente ao Nó da posição i na tela
                }
            } else { //Caso o Nó na posição i seja null
                try {
                    listaCirc()[i].setVisible(false); //Apaga o Circle correspondente ao Nó 
                    listaLbl()[i].setText(null); //Apaga o texto da Label(info do Nó) correspondente ao Nó 
                    listaLbl()[i].setVisible(false); //Apaga a Label correspondente ao Nó 
                    listaLine()[i].setVisible(false); //Apaga a Line correspondente ao Nó 
                } catch (NullPointerException np) {
                   JOptionPane.showMessageDialog(null, "a árvore está vazia");                   
                }

            }
        }
    }
    
    //Métodos onAction para ativar os métodos dos Buttons com ENTER
    @FXML
    private void onEnter() {
        addNo(null);
    }

    @FXML
    private void onEnter2() {
        removeNo(null);
    }
    
    @FXML
    private void onEnter3() {
        balancear(null);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
