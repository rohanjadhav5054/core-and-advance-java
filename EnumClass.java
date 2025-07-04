//enum class
enum Laptop{
    GtBook(74000),Loq(84000),G15(90000),victus(100000);
    private int prize;
    private Laptop(){
        prize = 50000;
    }
    private Laptop(int prize){
        this.prize = prize;
    }
    public int show(){
        return prize;
    }
    public void setPrize(int prize){
        this.prize = prize;
    }
}
public class EnumClass {
    public static void main(String args[]){
        // Laptop lap = Laptop.GtBook;
        // System.out.println(lap + " : "+lap.show());

        for(Laptop lap : Laptop.values()){
            System.out.println(lap +" : "+ lap.show());
        }
    }
}
