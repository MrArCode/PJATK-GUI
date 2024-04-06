public class Osoba implements Comparable<Osoba>{
    private String imie;
    private int wiek;

    public Osoba(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }


    @Override
    public int compareTo(Osoba o) {
        if(this.imie.equals(o.imie)){
            return Integer.compare(this.wiek, o.wiek);
        }
        return String.CASE_INSENSITIVE_ORDER.compare(this.imie, o.imie);
    }



    public String toString(){
        return "("+imie +", " + wiek+")";
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
}
