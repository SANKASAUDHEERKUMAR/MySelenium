package My_Project;

import java.util.ArrayList;
import java.util.List;

public class List_Compare {

	public void comparelists(List<Integer> abc,List<Integer> def) {
		
		
		
		if (abc.equals(def)) {
			
			System.out.println("Both are Equal");
		}
		else {
			System.out.println("Both are not Equal");
		}
	}
	
	public static void main(String[] args) {
		
		
		 List<Integer> list1=new ArrayList<Integer>(); 
		 list1.add(100); 
		 list1.add(200);
		 list1.add(300); 
		 list1.add(401); 
		 list1.add(500); 
		 list1.add(600);
		 list1.add(650);
          list1.add(500);
          
         
          for(int i:list1)
          {
        	  System.out.println(i);
          }
          
		 List<Integer> list2=new ArrayList<Integer>(); 
		 list2.add(100); 
		 list2.add(200); 
		 list2.add(300); 
		 list2.add(400); 
		 list2.add(500); 
		 list2.add(600);


		 List_Compare LC=new List_Compare();
			LC.comparelists(list1, list2);
		 
		
		
		  List<Integer> list3=new ArrayList<Integer>(); 
		  for (Integer temp : list2) {
		  list3.add(list1.contains(temp)? 1:0);
		  //System.out.println(list3);
		  }
		  
		  for(int i:list3)
          {
        	  System.out.println(i);
          }
		  
		  System.out.println(list3);
		 
	}

}
