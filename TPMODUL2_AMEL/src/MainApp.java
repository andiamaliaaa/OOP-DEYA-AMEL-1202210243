public class MainApp {
    public static void main(String[] args) throws Exception {
        Perangkat gadget = new Perangkat("Adata", 2, 1.80F);
        gadget.informasi();
        System.out.print("\n");

        Laptop laptopp = new Laptop("Seagate", 8, 2.40F, true);
        laptopp.informasi();
        laptopp.bukaGame( "Dota 2");
        laptopp.kirimEmail( "niceyuk@gmail.com");
        laptopp.kirimEmail( "annarji@gmail.com", "rusmangc@gmail.com");
        System.out.print("\n");

        Handphone hp = new Handphone("Sandisk",  3,  2.20F, false);
        hp.informasi();
        hp.telfon(628122122);
        hp.kirimSMS(62852112);
        hp.kirimSMS(628121212,629292211);
    }
}
