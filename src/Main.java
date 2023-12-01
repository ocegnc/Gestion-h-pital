public class Main {
    public static void main(String[] args) {
        Hopital h = new Hopital(5);

     /*   h.ajouterService(new Service("Cardiologie", 1));
        h.ajouterService(new Service("Neurologie", 2));
        h.ajouterService(new Service("Oncologie", 3));
        h.ajouterService(new Service("Pédiatrie", 4));
        h.ajouterService(new Service("Urgence", 5));

   */

    Service cardio = new Service("Cardiologie", 1);
    Service neuro = new Service("Neurologie", 1);
    Service ped = new Service("Pédiatrie", 1);
    Service urg = new Service("Urgence", 1);
    Service onco = new Service("Oncologie", 1);

    h.ajouterService(cardio);
    h.ajouterService(neuro);
    h.ajouterService(ped);
    h.ajouterService(urg);
    h.ajouterService(onco);


    /*for(int i=1; i<6 ; i++){
        LitAmbulatoire l1 = new LitAmbulatoire();
    }
    for(int i=1; i<6 ; i++){
        LitMoyenSejour l2 = new LitMoyenSejour();
    }
    for(int i=1; i<6 ; i++){
        LitLongSejour l3 = new LitLongSejour();
    }*/

    cardio.ajouterChambre(new Chambre(1,1,new LitAmbulatoire()));
    cardio.ajouterChambre(new Chambre(1,2,new LitAmbulatoire()));
    cardio.ajouterChambre(new Chambre(2,3,new LitAmbulatoire(), new LitAmbulatoire()));

    System.out.println(h);

    }
}