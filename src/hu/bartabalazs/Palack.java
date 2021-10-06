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
        this.jelenlegiUrtartalom = Math.min(jelenlegiUrtartalom, this.maxUrtartalom);
        if (this.jelenlegiUrtartalom == 0) {
            this.nev = null;
        }
    }
    public int suly(){
        return this.maxUrtartalom/35 + this.jelenlegiUrtartalom;
    }

    public boolean egyenloekE(Palack p){
        boolean egyseznekE = false;
        if (
                this.nev.equals(p.nev) &&
                this.maxUrtartalom == p.maxUrtartalom &&
                this.jelenlegiUrtartalom == p.jelenlegiUrtartalom
            )
        {
            egyseznekE = true;
        }

        return egyseznekE;
    }

    @Override
    public String toString() {
        return String.format("Palack, benne levo ital: %s, jelenleg %d ml van benne, maximum %d ml fer bele.",
                this.nev, this.jelenlegiUrtartalom, this.maxUrtartalom);
    }
}
