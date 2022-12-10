public class Gitar extends AlatMusik{
    
    public Gitar(String nama){
        super(nama);
    }

    @Override
    public void caraMain(){
        System.out.println("dipetik");
    }

    @Override
    public void suara(){
        System.out.println("jreng jreng jreng...");
    }
}
