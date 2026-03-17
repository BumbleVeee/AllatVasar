package teljes_oop;

public class Program {
    public static void main(String[] args) {
        HaromIsmeretlenesEgyenlet egyenlet;
        egyenlet = new HaromIsmeretlenesEgyenlet(3.5 , 0.5 , 1/3 , 100);
        
        Megoldo megoldo = new Megoldo(egyenlet);
        megoldo.megoldas(egyenlet);
    }
}
