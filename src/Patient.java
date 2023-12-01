public class Patient {
    private String nomP;
    private int numSecu;

    public Patient(String nomP, int numSecu){
        this.nomP=nomP;
        this.numSecu=numSecu;
    }

    public String affectation(AffectEnum a){
        String mes ="";
        if(a==AffectEnum.admission1){
            Admission1 s1 = new Admission1();
            s1.estAdmis();
        }else{
            Admission2 s2 = new Admission2();
            s2.estAdmis();
        }
        mes = "le patient a été admis à l'hôpital";
        return mes;
    }
}
