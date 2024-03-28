abstract class Muzyk {
    private String imie;
    private double czas;

    public Muzyk(String imie, double czas) {
        this.imie = imie;
        this.czas = czas;
    }



    abstract public String instrument();

    abstract public double stawka();

    public String imie(){
        return this.imie;
    }
    public double czas(){
        return this.czas;
    }

    public static String  maxHonorarium(Muzyk[] muzycy){
        Muzyk tenJedyny = muzycy[0];
        for (int i = 1; i < muzycy.length;i++){
            if(muzycy[i].stawka() * muzycy[i].czas() > tenJedyny.stawka() * tenJedyny.czas()){
                tenJedyny = muzycy[i];
            }
        }
        return new String(tenJedyny.getImie()+", czas = "+ tenJedyny.czas + "., stawka = " + tenJedyny.stawka());
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public double getCzas() {
        return czas;
    }

    public void setCzas(double czas) {
        this.czas = czas;
    }

}
