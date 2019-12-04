package testing_branch;

import java.util.LinkedList;

public class Database_Sorting {
	
	public static LinkedList<Clinic_Inventory> bubbleSort(LinkedList<Clinic_Inventory> myList) {
		
		System.out.println("LinkeList<Clinic_Inventory> before the bubble sort");
		
		for (Clinic_Inventory inventory : myList) {
			System.out.println(inventory.getITEM_NUMBER());
		}
		
		
		for (int i = myList.size() - 1; i > 0; i--) {
			
			for (int j = 0; j < i; j++) {
				
				if (myList.get(j).getITEM_NUMBER() > myList.get(j+1).getITEM_NUMBER()) {
					 
					
					Clinic_Inventory clinic = myList.get(j);
					Clinic_Inventory temp = myList.get(j+1); 
					 myList.set(j, temp);
					 myList.set(j + 1, clinic);
					 clinic = myList.get(j);
					
				}
				
			}
		}
		System.out.println();
		System.out.print("Newly Sorted List:");
		System.out.println();
		for (Clinic_Inventory clinic : myList) {
			
			System.out.println(clinic.getITEM_NUMBER());
		}
		
		return myList;
	}
	

}
