import java.util.ArrayList;
import java.util.Date;

public class Hopital {
    private int nbrServices;
    private ArrayList<Service> lesServices;

    private ArrayList<Admission> lesAdmis;


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

    public String admission(AffectEnum a, Patient p, Date heureAdmission ){
        String mes ="";
        if(a==AffectEnum.admission1){
            Admission1 s1 = new Admission1();
            s1.estAdmis(p, heureAdmission);
            lesAdmis.add(s1);
        }else{
            Admission2 s2 = new Admission2();
            s2.estAdmis(p, heureAdmission);
            lesAdmis.add(s2);
        }
        mes = "le patient a été admis à l'hôpital";
        return mes;
    }

}
