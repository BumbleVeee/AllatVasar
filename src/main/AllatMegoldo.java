package main;

public class AllatMegoldo {
    private double sAr, kAr, jAr;
    private int dbOsszeg;
    private int arOsszeg;
    
    public boolean megoldasEgyenletAr(int x, int y, int z){
        return sAr*x + kAr*y + jAr*z == arOsszeg;
    }
    
    public boolean megoldasEgyenletDb(int x, int y, int z){
        return x + y + z == dbOsszeg;
    }
    
    public void szamolas(int min, int hatar, boolean minusz) {
        int db = 0;
        if(minusz){
            min = -hatar;
        }else{
            min = 1;
        }
        for (int x = min; x <= hatar; x++) {
            for (int y = min; y <= hatar; y++) {
                for (int z = min; z <= hatar; z++) {
                    if(megoldasEgyenletAr(x,y,z) && megoldasEgyenletDb(x,y,z)){
                        db++;
                        System.out.printf("Sertes szama: %d, Kecske szama: %d, Juh szama: %d\n", x,y,z);
                    }
                }
            }
        }
        System.out.printf("Hanyszor futott a ciklus: %d", db);
    }
}
