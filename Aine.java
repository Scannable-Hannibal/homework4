import java.lang.reflect.Array;
import java.util.ArrayList;

public class Aine {

    private String kood;
    private String nimetus;
    private int ainepunktideArv;

    public Aine(String aineKood, String aineNimetus, int eap){
        kood = aineKood;
        nimetus = aineNimetus;
        ainepunktideArv = eap;
    }

    String getKood(){
        return kood;
    }
    void setKood(String str){
        kood = str;
    }
    String getNimetus(){
        return nimetus;
    }
    void setNimetus(String str){
        nimetus = str;
    }
    int getAinepunktideArv(){
        return ainepunktideArv;
    }
    void setAinepunktideArv(int num){
        ainepunktideArv = num;
    }

    public String toString(){
        return nimetus + " " + kood + " " + ainepunktideArv;
    }

    int tundideArv(){
        return ainepunktideArv * 8;
    }

    public static void main(String[] args) {

        // loon kaks test ainet
        String aineNimi1 = "Objektorienteeritud programmeerimine";
        String aineKood1 = "RT – 016";
        int ainePunktid1 = 5;

        Aine a1 = new Aine(aineNimi1, aineKood1, ainePunktid1);

        String aineNimi2 = "Diskreetne matemaatika ja loogika";
        String aineKood2 = "RT-005";
        int ainePunktid2 = 5;

        Aine a2 = new Aine(aineNimi2, aineKood2, ainePunktid2);

        // toString, setterite ja getterite testid
        System.out.println(a2);

        a2.setNimetus("Operatsioonisüsteemid");
        a2.setKood("RT-010");
        a2.setAinepunktideArv(3);

        System.out.println(a2.getNimetus());
        System.out.println(a2.getKood());
        System.out.println(a2.getAinepunktideArv());
        System.out.println(a2.tundideArv());

        // lisan ained listi
        ArrayList<Aine> ained = new ArrayList<>();
        ained.add(a1);
        ained.add(a2);

        //lisan ained õppekavasse
        Oppekava o1 = new Oppekava("Robootika", ained);

        //toString
        System.out.println(o1);

        // getterid ja setterid
        System.out.println(o1.getOppekavaKood());
        System.out.println(o1.getAined());
        o1.setOppekavaKood("Robootikatarkvara arendus");

        String aineNimi3 = "Tundmatu aine";
        String aineKood3 = "RT-999";
        int ainePunktid3 = 10;

        Aine a3 = new Aine(aineNimi3, aineKood3, ainePunktid3);
        o1.setAine(a3);

        //toString
        System.out.println(o1);
    }
}
