public class App {
    public static void main(String[] args) throws Exception {
        
        TransportasiAir ta = new TransportasiAir(4,20000);
        ta.informasi();
        ta.berlayar();
        ta.berlabuh();
        System.out.println("\n");
        Sampan sam = new Sampan(20,50000, 2);
        sam.informasi();
        sam.berlayar();
        sam.berlabuh();
        sam.berlabuh(2);
        System.out.println("\n");
        Kapal kap = new Kapal(50,10000,"Diesel");
        kap.informasi();
        kap.berlabuh();
        kap.berlayar();
        kap.berlayar(20);
    }
}
