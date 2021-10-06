package hu.bartabalazs;

public class Palack {
    private String nev;
    private int maxUrtartalom;
    private int jelenlegiUrtartalom;

    public Palack(String nev, int maxUrtartalom, int jelenlegiUrtartalom) {
        this.nev = nev;
        this.maxUrtartalom = maxUrtartalom;
        this.jelenlegiUrtartalom = jelenlegiUrtartalom;
    }

    public Palack(String nev, int maxUrtartalom) {
        this.nev = nev;
        this.maxUrtartalom = maxUrtartalom;
        this.jelenlegiUrtartalom = 1;
    }

    public int getJelenlegiUrtartalom() {
        return jelenlegiUrtartalom;
    }

    public void setJelenlegiUrtartalom(int jelenlegiUrtartalom) {
        this.jelenlegiUrtartalom = jelenlegiUrtartalom;
    }
}
