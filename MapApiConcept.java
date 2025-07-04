import java.util.Map;

public class MapApiConcept {
    public static void main(String args[]){
         /*Hash Map */
         System.out.println("Here we are implementing HashMap \n");
         Map<String,Integer> mp = new HashMap<String ,Integer>();
         mp.put("Sadiya", 90);
         mp.put("Rohan", 91);
         mp.put("Numan", 85);
         mp.put("kaivalya",76);
         mp.clear();
         System.out.println(mp);//for printing the values
         System.out.println(mp.get("Numan"));//if we want value for a perticular key value .
         System.out.println(mp.keySet());//it gives all the keys !.
 
         
         Map<String,Integer> ms = new Hashtable<>();
         ms.put("Sadiya", 90);
         ms.put("Rohan", 91);
         ms.put("Numan", 85);
         ms.put("kaivalya",76);
 
         System.out.println(ms);
 
         //LinkedHashMap
         System.out.println("\nHere we are implementing Linked Hash Map\n");
 
         Map <String ,Integer> lhm = new LinkedHashMap<String,Integer>();
 
         lhm.put("king", 95);
         lhm.put("Queen", 95);
         lhm.put("Servent", 19);
         lhm.put("Commander", 45);
         lhm.put("dancer", 1);
 
         System.out.println(lhm);
 
         //TreeMap
         System.out.println("\nHere we are implementing Tree Map\n");
 
         Map<String,Integer> tm = new TreeMap<String,Integer>();
         tm.put("king", 95);
         tm.put("queen", 95);
         tm.put("servent", 19);
         tm.put("commander", 45);
         tm.put("dancer", 1);
 
         System.out.println(tm);
         tm.clear();             // this method is used for removing all of the elements .
         System.out.println(tm);
    }
}

/*
 *Map - map is the datastructure that supports kay value pair for mapping the data.
It doen't support duplicate keys 

Map Interface implemented by different classes
it is not a subtype of colllection interface
 1.HashMap - it uses hashing to store the data.
 2.LinkedHashMap - Similar to hash map but additional feature is it maintain its order of elements inserted into it.
 3.TreeMap - sorting order maintained by TreeMap must be consistent
 */
