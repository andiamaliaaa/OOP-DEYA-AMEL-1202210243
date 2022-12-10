public class App {
    public static void main(String[] args) throws Exception {
        TransportasiAir transportasi = new TransportasiAir(4, 20000);
        transportasi.informasi();
        transportasi.berlayar();
        transportasi.berlabuh();
        System.out.println("\n");
        Sampan sn = new Sampan(20, 50000, 2);
        sn.informasi();
        sn.berlayar();
        sn.berlabuh();
        sn.berlabuh(2);
        System.out.println("\n");
        Kapal kl = new Kapal(50, 100000, "Diesel");
        kl.informasi();
        kl.berlayar();
        kl.berlayar(20);
        kl.berlabuh();
    }
}
