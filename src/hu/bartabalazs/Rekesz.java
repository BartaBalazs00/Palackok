package hu.bartabalazs;

import java.util.ArrayList;

public class Rekesz {
    private int maxTeherbírás;
    private ArrayList<Palack> palackok;

    public Rekesz(int maxTeherbírás) {
        this.maxTeherbírás = maxTeherbírás;
        palackok = new ArrayList<>();
    }

    public int suly(){
        int ossz =0;
        for (Palack palack:
             palackok) {
            ossz+=palack.suly();
        }
        return ossz;
    }
    public boolean ujPalack(Palack p){
        boolean l =false;
        if (p.suly()+this.suly() <=this.maxTeherbírás){
            palackok.add(p);
            l=true;
        }
        return l;
    }

    public int osszesPenz(){
        int ossz =0;
        for (Palack item:
             palackok) {
            if(item instanceof VisszaValthatoPalack){
                ossz+= ((VisszaValthatoPalack) item).getPalackDij();
            }
        }
        return ossz;
    }

    @Override
    public String toString() {
        String s = "";
        for (Palack item:
             palackok) {
            s += item+"\n";
        }
        return s;
    }
}