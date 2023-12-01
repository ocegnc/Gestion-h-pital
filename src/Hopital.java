import java.util.ArrayList;

public class Hopital {
    private int nbrServices;
    private ArrayList<Service> lesServices;

    public Hopital(int nbrServices) {
        this.nbrServices = nbrServices;
        this.lesServices = new ArrayList<>();
    }

    public int getNbrServices() {
        return nbrServices;
    }

    public ArrayList<Service> getLesServices() {
        return lesServices;
    }

    public void ajouterService(Service service){
        if(lesServices.size()<9){
            lesServices.add(service);
        }
    }

    public String toString(){
        return "L'hôpital est composée de " + getNbrServices() + " services :\n" + getLesServices();
    }

}
