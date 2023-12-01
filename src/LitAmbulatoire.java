import java.sql.Time;

public class LitAmbulatoire extends Lit{
    public LitAmbulatoire() {
        super();
        this.occupationMax = 24*60*60;
        this.type = "Ambulatoire";
    }


}
