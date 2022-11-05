public class Menu {

    public void menu(){
        String menu1 = "Bakso";
        String tipemenu1 = "Makanan";
        int hmenu1 = 10000;

        String menu2 = "Es Teh";
        String tipemenu2 = "Minuman";
        int hmenu2 = 5000;

        String menu3 = "Brownies";
        String tipemenu3 = "Dessert";
        int hmenu3 = 15000;

        System.out.println("""
                Menu
                ===================================
                """);
        System.out.println("1. "+menu1+" "+tipemenu1+" Rp. "+hmenu1+"\n2. "+menu2+" "+tipemenu2+" Rp. "+hmenu2+"\n3. "+menu3+" "+tipemenu3+" Rp. "+hmenu3+"\n");
    }

}
