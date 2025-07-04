enum Lmlmv{
    MoQiangQhang,GuSheng,XiaoXing,JueMei,Doudou,FengYasong;
}

public class IfElseEnum {
    public static void main(String args[]){
        Lmlmv cute = Lmlmv.GuSheng;

        if(cute == Lmlmv.GuSheng){
            System.out.println("You are the most beautiful");
        }else if(cute == Lmlmv.Doudou){
            System.out.println("You are most Hardworking person !");
        }
        else if(cute == Lmlmv.MoQiangQhang){
            System.out.println("You are the most handsome person");
        }
        else if(cute == Lmlmv.XiaoXing){
            System.out.println("You are deserved juemei");
        }
        else{
            System.out.println("You are all the best persons !");
        }

        switch(cute){
            case GuSheng:
                System.out.println("You are the most beautiful");
                break;
            case MoQiangQhang:
                System.out.println("You are the calm and intelligent person !");
                break;
            case Doudou:
                System.out.println("you are best");
                break;
            case FengYasong:
                System.out.println("You are the youngest but best !");
                break;
            case JueMei:
                System.out.println("You are always successful !");
                break;
            case XiaoXing:
                System.out.println("You are the best and beautiful");
                break;
            default:
                System.out.println("You are all the best persons !");
        }
    }    
}
