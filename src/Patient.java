public class Patient {
    private String nomP;
    private int numSecu;

    public Patient(String nomP, int numSecu){
        this.nomP=nomP;
        this.numSecu=numSecu;
    }

    public int payerTarif(int tempsOccupe, String typeLit, String typeChambre){
        int tarif = 0;
        if(typeLit.equals("ambulatoire")){
            tarif+=tempsOccupe*15/(24*60*60);
            if(typeChambre.equals("simple")){
                tarif+=tarif*2;
            }
        }
        if(typeLit.equals("moyen séjour")) {
            tarif += tempsOccupe * 20 / (24 * 60 * 60 * 14);
            if (typeChambre.equals("simple")) {
                tarif += tarif * 2;
            }
        }
        if(typeLit.equals("ambulatoire")) {
            tarif += tempsOccupe * 25 / (24 * 60 * 60*30);
            if (typeChambre.equals("simple")) {
                tarif += tarif * 2;
            }
        }
        return tarif;
    }
}
