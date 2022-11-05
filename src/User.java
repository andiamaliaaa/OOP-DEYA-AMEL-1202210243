import java.util.Scanner;

public class User {
    Scanner user = new Scanner(System.in);
    public void inputuser(){
        System.out.print("Nama : ");
        String nama = user.nextLine();
        System.out.print("No. Handphone : ");
        int nomorhp = user.nextInt();
        
        System.out.println("\nRegister Success");
        System.out.println("Name : "+nama+"\nPhone Number : "+nomorhp);
    }
}
