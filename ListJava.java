import java.util.*;
public class ListJava {
    public static void main(String args[]){
        //ArrayList
        List<Integer> ls = new ArrayList<Integer>();//always specify the type 
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(3);
        ls.add(4);

        System.out.println("\n"+ls+"\n");//it prints whole list in one line

        for(int op : ls){
            System.out.println(op);//it also prints whole list but every letter in new line
        }

        System.out.println(ls.get(4));//if you want index of a perticular index

        ls.add(3, 34);
        System.out.println("\t"+ls);//if we want to add a perticular number at perticular index

        //list contains dublicate values 
        //it cannot arranges in order
        System.out.println("Here it is implementation of the linked list ! ");
        //LinkedList
        List<Integer> lt = new LinkedList<Integer>();
        lt.add(10);
        lt.add(30);
        lt.add(45);
        lt.add(2, 35);//used to insert element at perticular index
        
        System.out.println(lt);

    }    
}
//List Interface
//This is the child interface of collection interface 
//This interface is dedicated to data of the list type in which we can store all the ordered collection of objects 
//This interface can be implemented by following classes 
//1.ArrayList 2. Vector 3.Stack