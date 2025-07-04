public class string_buffer {
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer("Rohan jadhav");
        //string buffer is a way to represent the mutable string it gives 16 bit extra space to apend the string.
        sb.append("jadhav");

        System.out.println(sb);

        String str = sb.toString();
        // normally we are not able to assign string buffer to string data type string because string is immutable in java
        // but using toString () method we can assign string buffer to string data type
        System.out.println(str);

        sb.insert(0,"king");//we are also insert the string at the particular index
        System.out.println(sb);


        sb.delete(0,4);//giving starting and ending index
        sb.deleteCharAt(1);//we are also able to delete character at any index;
        System.out.println(sb);
    }
    
}
