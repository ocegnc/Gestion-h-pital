import java.sql.Time;

public class LitLongSejour extends Lit{
    public LitLongSejour() {
        super();
        this.occupationMax = 24*60*60*30;
        this.type = "Long séjour";
    }
}
