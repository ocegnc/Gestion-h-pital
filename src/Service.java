import java.util.ArrayList;

public class Service {
    private String nom;
    private int num;
   // private int nbChambresSimples;
   // private int nbChambresDoubles;
    private ArrayList<Chambre> lesChambresSimples;
    private ArrayList<Chambre> lesChambresDoubles;


    public Service(String nom, int num) {
        this.nom = nom;
        this.num = num;
       // this.nbChambresSimples = nbChambresSimples;
       // this.nbChambresDoubles = nbChambresDoubles;
        this.lesChambresSimples = new ArrayList<>();
        this.lesChambresDoubles = new ArrayList<>();

        /*for (int i = 1; i <= nbChambresSimples; i++) {
            lesChambresSimples.add(new Chambre(1, i, Lit lit1));
        }*/

    }

    public String getNom() {
        return nom;
    }

    public int getNumService() {
        return num;
    }

    public String getNumChambre(Chambre c){
        String rep = "";
        if(c.getNum()<=9){
            rep = getNumService()+"0"+c.getNum();
        }
        if(c.getNum()>=10 && c.getNum()<=99){
            rep = getNumService()+""+c.getNum();
        }
        return rep;
    }

    public void ajouterChambre(Chambre c){
        if(c.getNbLit()==1){
            lesChambresSimples.add(c);
        } else{
            lesChambresDoubles.add(c);
        }
    }

    public String toString(){
        int nbChambres = lesChambresSimples.size()+lesChambresDoubles.size();
        String res = "Service " + " : " + getNom()
                + " composé de " + nbChambres + " chambres";
        for(Chambre c : lesChambresSimples){
            res += "\n --> Chambre " + getNumChambre(c) + " : " + c;
        };
        for(Chambre c : lesChambresDoubles){
            res += "\n --> Chambre " + getNumChambre(c) + " : " + c;
        };
        return res;
    }

}
