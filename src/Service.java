import java.util.ArrayList;

public class Service {
    private String nom;
    private int num;
    private ArrayList<Chambre> lesChambresSimples;
    private ArrayList<Chambre> lesChambresDoubles;


    public Service(String nom, int num) {
        this.nom = nom;
        this.num = num;
        this.lesChambresSimples = new ArrayList<>();
        this.lesChambresDoubles = new ArrayList<>();

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
        String res = "Service " + getNumService() + " : " + getNom()
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
