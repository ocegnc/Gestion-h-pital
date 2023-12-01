public class Chambre {
    private int nbLit;
    private Service s;
    private int num;
    private Lit lit1;
    private Lit lit2;


    public Chambre(int nbLit, int num, Lit lit1) {
        this.nbLit = nbLit;
        this.num = num;
        this.lit1 = lit1;
    }
    public Chambre(int nbLit, int num, Lit lit1, Lit lit2) {
        this.nbLit = nbLit;
        this.num = num;
        this.lit1 = lit1;
        this.lit2 = lit2;
    }

    public int getNum() {
        return num;
    }

    public int getNbLit() {
        return nbLit;
    }

    public String toString(){
        return " contenant " + getNbLit() + lit1.getType();
    }

}
