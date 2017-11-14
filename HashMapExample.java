package hash;
import java.util.HashMap;
import java.util.Iterator;
public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hashmap=new HashMap<Integer,String>(); 
		// Adding values to HashMap as ("keys", "values")

		 hashmap.put(1,"Sachin");
		 hashmap.put(2,"Dravid");
		 hashmap.put(3,"sehwag");
		 hashmap.put(4,"Dhoni");
		 hashmap.put(6,"Ganguly");
		//displays the set of hashMap 
		 System.out.println("Names are:");
		 //creates an object 
			Iterator valueIterator=hashmap.values().iterator();
			while(valueIterator.hasNext())
			{
				System.out.println(valueIterator.next());	
			
			}
			//it will place the values in 
		 hashmap.put(5,"Virat");
		 System.out.println("\nNames are:");
			Iterator valueIterator1=hashmap.values().iterator();
			while(valueIterator1.hasNext())
			{
				System.out.println(valueIterator1.next());	
			
			}
			
		
		 String val=hashmap.get(4);//tries to get the value 4
		 System.out.println("\nThe value mapped to key 4 is:"+val);
	
		 String val2=hashmap.get(7);//tries to get the value 7
		 System.out.println("\nThe value mapped to key 7 is:"+val2);
		 
		 
		 System.out.println("\nHashMap:");//prints hashmap
		 System.out.println(hashmap);
		 System.out.println("\nclear HashMap:");
		 hashmap.clear();//clears the hash map
		 System.out.println("After clearing hashmap:");
		 System.out.println(hashmap);
	
	
	
	}

}
