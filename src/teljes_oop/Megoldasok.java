package teljes_oop;

public class Megoldasok {
    private int sDb, kDb, jDb;
    private int dbOsszes;

    public Megoldasok(int sDb, int kDb, int jDb, int dbOsszes) {
        this.sDb = sDb;
        this.kDb = kDb;
        this.jDb = jDb;
        this.dbOsszes = dbOsszes;
    }

    public int getsDb() {
        return sDb;
    }

    public int getkDb() {
        return kDb;
    }

    public int getjDb() {
        return jDb;
    }
    
    public boolean megoldasEgyenletDb(int sDb, int kDb, int jDb){
        return sDb + kDb + jDb == dbOsszes;
    }
}
