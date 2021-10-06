package hu.bartabalazs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Teszt {
    private ArrayList<Rekesz> rekeszek;
    public Teszt(){
        rekeszek = new ArrayList<>();
        //elso();
        masodik();
    }

    private void masodik() {
        beolvas();
    }

    private void beolvas() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("palackok.txt"));
            rekeszek.add(new Rekesz(10000));
            String sor = br.readLine();
            while (sor != null){
                Palack p;
                String[] adatok = sor.split(";");
                if (adatok.length == 2){
                    p = new Palack(adatok[0], Integer.parseInt(adatok[1]));
                } else if(adatok.length == 3){
                    p = new Palack(adatok[0], Integer.parseInt(adatok[1]), Integer.parseInt(adatok[2]));
                } else {
                    p = new VisszaValthatoPalack(adatok[0], Integer.parseInt(adatok[1]), Integer.parseInt(adatok[2]), Integer.parseInt(adatok[3]));
                }
                boolean siker = rekeszek.get(rekeszek.size()-1).ujPalack(p);
                if (!siker){
                    rekeszek.add(new Rekesz(10000));
                }
                sor = br.readLine();
                br.close();
            }
        }catch (FileNotFoundException e){
            e.getMessage();
        } catch (IOException e){
            e.getMessage();
        } catch (Exception e){
            e.getMessage();
        }
    }

    private void elso(){
        Palack p = new Palack("tej", 1000, 1000);
        Palack p2 = new Palack("Kakaó", 500, 200);
        VisszaValthatoPalack vp1 = new VisszaValthatoPalack("Kóla",200, 200, 25);

        Rekesz r = new Rekesz(90000);
        r.ujPalack(p);
        r.ujPalack(p2);
        r.ujPalack(vp1);
        System.out.println(p);
        System.out.println(p2);
        System.out.println(vp1);
        System.out.println(r);
    }
}