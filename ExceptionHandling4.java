class Rohan{
    static{
        System.out.println("Rohan is loaded ! ");
    }

    public void show()throws ClassNotFoundException , Exception{//here we can also write multiple  exceptions 
        Class.forName("Sadiya");
    }
}

public class ExceptionHandling4 {
    public static void main(String args[]){
        Rohan obj = new Rohan();
        try{
            obj.show();
        }
        catch(ClassNotFoundException e){
            System.out.println("You are not written the class ! ");

            e.printStackTrace();//this will print the whole stack trace of the exception
        }
        catch(Exception e){
            System.out.println("Something happened ! ");
        }
    }
}
