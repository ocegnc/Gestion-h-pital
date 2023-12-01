import java.sql.Time;

public abstract class Lit {
    protected int occupationMax;
    protected String type;
    protected boolean libre;

    public int getOccupationMax() {
        return occupationMax;
    }

    public String getType() {
        return type;
    }

    public boolean isLibre() {
        return libre;
    }

    public boolean occuperLit(){
        return this.libre = false;
    }
    public boolean libererLit(){
        return this.libre = true;
    }


}
