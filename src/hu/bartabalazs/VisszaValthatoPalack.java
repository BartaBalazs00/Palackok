package hu.bartabalazs;

public class VisszaValthatoPalack extends Palack{

    private int palackDij;

    public VisszaValthatoPalack(String nev, int maxUrtartalom, int jelenlegiUrtartalom, int palackDij) {
        super(nev, maxUrtartalom, jelenlegiUrtartalom);
        this.palackDij = palackDij;
    }

    public int getPalackDij() {
        return palackDij;
    }

    @Override
    public String toString() {
        return "Visszaváltható"+super.toString();
    }
}
