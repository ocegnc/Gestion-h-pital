import java.util.ArrayList;
import java.util.Date;

public class Admission1 implements Admission{
    private String type;
    private Service service;
    private ArrayList<Chambre> lesChambres;
    private ArrayList<Service> lesServices;


    public void estAdmis(Patient p, Date heureAdmission){
        for (Service s : lesServices) {
            for (Chambre c : lesChambres) {
                if ((c.getNbLit()==2) && (type=="double")) {
                    if(c.getLit1().isLibre()==true){
                        c.getLit1().occuperLit();
                    }else{
                        if(c.getLit2().isLibre()==true){
                            c.getLit2().occuperLit();
                        }
                    }
                }
                if ((c.getNbLit()==1) && (type=="simple")){
                    if(c.getLit1().isLibre()==true) {
                        c.getLit1().occuperLit();
                    }
                }
                p.attribuerChambre(c, heureAdmission);
            }
        }
    }

    public void estSorti(Patient p){
        if (p.getC() !=null){
            p.getC().getLit1().libererLit();
        }
    }
}
