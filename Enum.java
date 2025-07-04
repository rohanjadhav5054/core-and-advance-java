enum Wifty{
    SuZaiZai,ZhangLurang,GuRan,JiangJia;
}
enum HiddenLove{
    SangZhi,DuanJiaxu,SangYan;
}
//Enum is basically a set of named constants 
//when we use enum we can use the name of the constant instead of the value of the constant
public class Enum{
    public static void main(String args[]){
        Wifty zai = Wifty.SuZaiZai;
        System.out.println(zai);
        //what if we want all constants 
        HiddenLove zhi[] = HiddenLove.values();
        for(HiddenLove ch:zhi){
            System.out.println(ch);
        }
    }
}
