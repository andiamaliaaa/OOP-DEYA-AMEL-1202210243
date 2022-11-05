import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("""
            Selamat Datang di Restoran EAD
            Silahkan Register Terlebih Dahulu
            ===================================
            """);
        User user = new User();
        user.inputuser();

        Menu showmenu = new Menu();

        boolean status = true;
        while (status == true){
            System.out.println("""
                ===================================  
                1. Menu
                2. Pilih Menu
                3. Keluar  
                ===================================
                """);
            System.out.print("Masukkan pilihan : ");
            int pilihan = input.nextInt();
            if (pilihan == 1){
                showmenu.menu();
            }else if (pilihan == 2){
                System.out.println("Masukkan Nama Menu : ");
                String menuu = input.nextLine();
                System.out.println("Hasil Pencarian : "+menuu);
                System.out.println("===================================");
                
            }else if (pilihan == 3){
                System.out.println("Terima Kasih");
                status = false;
            }
        }
    }
}