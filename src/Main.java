public class Main {
    public static void main(String[] args) {
        Hopital h = new Hopital(5);

        h.ajouterService(new Service("Cardiologie", 1));
        h.ajouterService(new Service("Neurologie", 2));
        h.ajouterService(new Service("Oncologie", 3));
        h.ajouterService(new Service("Pédiatrie", 4));
        h.ajouterService(new Service("Urgence", 5));



    }
}