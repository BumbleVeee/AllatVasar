package teljes_oop;

public class Megoldo {
    private HaromIsmeretlenesEgyenlet egyenlet;
    private Megoldasok[] megoldasok;

    public Megoldo(HaromIsmeretlenesEgyenlet egyenlet) {
        this.egyenlet = egyenlet;
        megoldasok = new Megoldasok[2];
    }
    
    public void megoldas() {
        int dbOsszes = 0;
        int dbJo = 0;
        for (int sDb = 1; sDb <= 28; sDb++) {
            for (int kDb = 1; kDb <= 98-sDb; kDb++) {
                for (int jDb = 3; jDb <= 72; jDb++) {
                    if(sDb+kDb+jDb == 100 && sDb*sAr + kDb*kAr + jDb*jAr == 100){
                        dbJo++;
                        System.out.printf("Sertes szama: %d, Kecske szama: %d, Juh szama: %d\n", sDb,kDb,jDb);
                    }
                    dbOsszes++;
                }
            }
        }
        System.out.printf("Hanyszor futott a ciklus: %d", dbOsszes);
    }

    public Megoldasok[] getMegoldasok() {
        return megoldasok;
    }
}
