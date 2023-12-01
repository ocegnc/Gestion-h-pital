import java.util.ArrayList;

public class Hopital {
    private int nbrServices;
    private ArrayList<Service> lesServices;

    public Hopital(int nbrServices) {
        this.nbrServices = nbrServices;
        this.lesServices = new ArrayList<>();
    }

    public void ajouterService(Service service){
        if(lesServices.size()<9){
            lesServices.add(service);
        }
    }

}
