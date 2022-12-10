public class Piano extends AlatMusik{
    
    public Piano(String nama){
        super(nama);
    }

    @Override
    public void caraMain(){
        System.out.println("ditekan");
    }

    @Override
    public void suara(){
        System.out.println("teng teng teng...");
    }
}
