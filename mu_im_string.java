public class mu_im_string {
    //mutable and im mutable string in java 
    public static void main(String args[]){
        String name = "Rohan";

        name = name + "jadhav";
        System.out.println(name);

        String n1 = "rohan";//n1 and n2 allowted same address in heap because of same string 
        String n2 = "rohan";
        System.out.println(n1 == n2);
    }
    
}
