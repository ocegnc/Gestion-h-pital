import java.sql.Time;

public class LitMoyenSejour extends Lit{

    public LitMoyenSejour() {
        super();
        this.occupationMax = 24*60*60*14;
        this.type = "Moyen séjour";
    }
}
