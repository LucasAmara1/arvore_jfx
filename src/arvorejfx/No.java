package arvorejfx;
/**
 *
 * @author Lucas Amaral
 */
public class No {
    
    private No pai, esq, dir, prox;
    private int info; 

    public No() {
        this.pai = null;
        this.dir = null;
        this.esq = null;
        this.prox = null;
    }

    public No(int info) {
        this.info = info;
    }  

    public No getPai() {
        return pai;
    }

    public void setPai(No pai) {
        this.pai = pai;
    }

    public No getDir() {
        return dir;
    }

    public void setDir(No dir) {
        this.dir = dir;
    }

    public No getEsq() {
        return esq;
    }

    public void setEsq(No esq) {
        this.esq = esq;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "No{info=" + info + '}';
    }
     
}
