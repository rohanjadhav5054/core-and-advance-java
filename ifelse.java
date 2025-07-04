class ifelse{
    public static void main(String args[]){
        int x = 10;
        int y = 20;
        int z = 20;

        if(x > y){
            if(x > z){
                System.out.println("Greater number is"+x);
            }
            else{
                System.out.println("Greater number is"+z);
            }
        }
        else{
            if(y > z){
                System.out.println("Greater number is "+y);
            }
            else{
                System.out.println("Greater number is "+z);
            }
        }
    }
}