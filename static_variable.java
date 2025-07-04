
class static_keyword{
    String mobile_brand;
    int price;
    static String os;

    public void print(){
        System.out.println("Name : "+mobile_brand+" "+price +" "+os);
    }
}
public class static_variable{
    //static keyword used for class level only 
    public static void main(String args[]){
        static_keyword sk1 = new static_keyword();
        sk1.mobile_brand = "Nothing";
        sk1.price = 40000;
        static_keyword.os = "Android";//for all the instances single copy will be provided 

        static_keyword sk2 = new static_keyword();
        sk2.mobile_brand = "huawei";
        sk2.price = 200000;
        sk1.print();
        sk2.print();

    }
}