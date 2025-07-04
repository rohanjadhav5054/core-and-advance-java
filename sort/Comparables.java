package sort;
import java.util.*;

class Manager implements Comparable<Manager>{
    int id;
    String name;
    
    public Manager(int id,String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Manager [id=" + id + ", name=" + name + "]";
    }
    @Override
    public int compareTo(Manager that) {
        if(this.id > that.id){
            return 1;
        }else{
            return -1;
        }
    }
}
public class Comparables{
    public static void main(String args[]){
        List<Manager> manage = new ArrayList<>();
        manage.add(new Manager(21,"su zai zai"));
        manage.add(new Manager(27,"zhou siyue"));
        manage.add(new Manager(25,"ding xian"));
        manage.add(new Manager(24,"si tu mo"));

        Collections.sort(manage);

        for(Manager m : manage ){
            System.out.println(m);
        }

    }
}
//so basically what is comparator is 
//if you want to give a power to the class to compare its object to itself we can use comparator .