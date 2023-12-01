import java.util.ArrayList;

public class Service {
    private String nom;
    private int num;
    private ArrayList<Chambre> lesChambres;

    public Service(String nom, int num) {
        this.nom = nom;
        this.num = num;
        this.lesChambres = new ArrayList<>();
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
        if(lesChambres.size()<99){
            lesChambres.add(c);
        }
    }

    public String toString(){
        String res = "Service " + getNumService() + " : " + getNom()
                + " composé de " + lesChambres.size() + " chambres";
        for(Chambre c : lesChambres){
            res += "\n --> Chambre " + getNumChambre(c) + " : " + c.toString();
        };
        return res;
    }

}
