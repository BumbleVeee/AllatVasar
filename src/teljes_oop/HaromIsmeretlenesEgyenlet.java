package teljes_oop;

public class HaromIsmeretlenesEgyenlet {
    private double sAr, kAr, jAr;
    private int arOsszes;

    public HaromIsmeretlenesEgyenlet(double sAr, double kAr, double jAr, int arOsszes) {
        this.sAr = sAr;
        this.kAr = kAr;
        this.jAr = jAr;
        this.arOsszes = arOsszes;
    }

    public double getsAr() {
        return sAr;
    }

    public double getkAr() {
        return kAr;
    }

    public double getjAr() {
        return jAr;
    }
    
    public boolean megoldasEgyenletAr(int sDb, int kDb, int jDb){
        return sAr*sDb + kAr*kDb + jAr*jDb == arOsszes;
    }
}
