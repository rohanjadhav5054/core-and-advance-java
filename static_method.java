class static_method_{
    String mobile_brand;
    int price;
    static String os;

    public void print(){
        System.out.println("Name : "+mobile_brand+" "+price +" "+os);
    }
    //we can use the static variable inside the static method 
    //but we can not directly access non static instance variable inside the static method
    //for using static instance variable we need to create the object of the class
    //that class passed into when we calling static method  
    public static void print1(static_method_ obj){
        System.out.println("In static method Name : "+obj.mobile_brand+" "+obj.price+" "+os);
    }
    //static method can be accessed before any instance is created 
    //it can be accessed by using class name 
    //when we call static method it will call the method on class not on instance
       

}
public class static_method{
    //static keyword used for class level only 
    public static void main(String args[]){
        static_method_ sk1 = new static_method_();
        sk1.mobile_brand = "Nothing";
        sk1.price = 40000;
        static_method_.os = "Android";//for all the instances single copy will be provided 

        static_method_ sk2 = new static_method_();
        sk2.mobile_brand = "huawei";
        sk2.price = 200000;
        sk1.print();
        sk2.print();
        static_method_.print1(sk1);


    }
}