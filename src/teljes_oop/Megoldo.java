package teljes_oop;

public class Megoldo {
    private HaromIsmeretlenesEgyenlet egyenlet;
    private Megoldasok[] megoldasok;

    public Megoldo(HaromIsmeretlenesEgyenlet egyenlet) {
        this.egyenlet = egyenlet;
        megoldasok = new Megoldasok[2];
    }
    
    public void megoldas(HaromIsmeretlenesEgyenlet egyenlet) {
        int dbOsszes = 0;
        int dbJo = 0;
        for (int sDb = 1; sDb <= 28; sDb++) {
            for (int kDb = 1; kDb <= 98-sDb; kDb++) {
                for (int jDb = 3; jDb <= 72; jDb++) {
                    if(sDb+kDb+jDb == 100 && sDb*egyenlet.getsAr() + kDb*egyenlet.getkAr() + jDb*egyenlet.getjAr() == 100){
                        dbJo++;
                        System.out.printf("Sertes szama: %d, Kecske szama: %d, Juh szama: %d\n", sDb,kDb,jDb);
                        System.out.printf("Az sertések száma, kecskék száma és a juhok száma összesen: %d\n", (sDb+kDb+jDb));
                        System.out.printf("Az elköltött arany összesen: %d\n", (int) (sDb*egyenlet.getsAr() + kDb*egyenlet.getkAr() + jDb*egyenlet.getjAr()));
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
