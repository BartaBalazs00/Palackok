package hu.bartabalazs;

public class Main {

    public static void main(String[] args) {
        Palack p = new Palack("tej", 1000, 1000);
        Palack p2 = new Palack("Kakaó", 500, 200);
        VisszaValthatoPalack vp1 = new VisszaValthatoPalack("Kóla",200, 200, 25);
        System.out.println(p);
        System.out.println(p2);
        System.out.println(vp1);
    }
}
