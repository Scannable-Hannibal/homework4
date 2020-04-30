import java.util.ArrayList;

public class Oppekava {

    String oppekavaKood;
    ArrayList<Aine> ained = new ArrayList<>();

    // konstruktor 1 - Loob õppekava mitme ainega
    public Oppekava(String oppekavaKood, ArrayList<Aine> ained ){
        this.oppekavaKood = oppekavaKood;
        this.ained = ained;
    }
    /*
    // konstruktor 2 - loob õppekava ühe ainega
    public Oppekava(String oppekavaKood, Aine aine ){
        this.oppekavaKood = oppekavaKood;
        this.ained.add(aine);
    }
    // konstuktor 3 - loob õppekava ilma aineteta
    public Oppekava(){
    }
     */

    String getOppekavaKood(){
        return oppekavaKood;
    }
    void setOppekavaKood(String oppekavaKood){
        this.oppekavaKood = oppekavaKood;
    }

    ArrayList<Aine> getAined(){
        return ained;
    }

    void setAine(Aine aineNimi){
        ained.add(aineNimi);
    }
    void setAined(ArrayList<Aine> aineNimed){
        for(int i=0; i < aineNimed.size(); i++){
            ained.add(aineNimed.get(i));
        }
    }

    public String toString(){
        /*
        ArrayList<String> nimekiri = new ArrayList<>();
        for(int i=0; i < ained.size(); i++){
            nimekiri.add(ained.get(i).toString());
            }
        }
        */

        //return oppekavaKood + "\n" + nimekiri;
        //return nimekiri;
        return oppekavaKood + " " + ained;
    }
}