import java.util.ArrayList;

public class Admission1 implements Admission{
    private String type;
    private Service service;
    private ArrayList<Admission1> lesAdmis;

    public void estAdmis(ArrayList<Service> lesServices ){
        for (Service s : lesServices) {
            for (Chambre c : lesChambres) {
                if (c.getLit1().isLibre()=true) {

                }
            }


        }
    }

    public void estSorti(Patient p){


    }
}
