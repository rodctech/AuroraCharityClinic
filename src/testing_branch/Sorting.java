//package testing_branch;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.List;
//
//public class Sorting {
//		
//	public static void main(String[] args) {
//		LinkedList<Clinic_Inventory> myList = new LinkedList<Clinic_Inventory>();
//		
//		//int size = 5;
//		
//		 myList.add(new Clinic_Inventory(19, "TEST", "TEST", "TEST", "TEST", "TEST", 7, 9, 40));
//		 myList.add(new Clinic_Inventory(15, "TEST", "TEST", "TEST", "TEST", "TEST", 7, 9, 40));
//		 myList.add(new Clinic_Inventory(18, "TEST", "TEST", "TEST", "TEST", "TEST", 7, 9, 40));
//		 myList.add(new Clinic_Inventory(17, "TEST", "TEST", "TEST", "TEST", "TEST", 7, 9, 40));
//		 myList.add(new Clinic_Inventory(16, "TEST", "TEST", "TEST", "TEST", "TEST", 7, 9, 40));
//		 myList.add(new Clinic_Inventory(14, "TEST", "TEST", "TEST", "TEST", "TEST", 7, 9, 40));
//		
//		 
//		 System.out.println("Before sorted:");
//		 for (Clinic_Inventory i : myList) {
//			 System.out.println(i.getITEM_NUMBER());
//		 }
//		 
//		 for (int i = myList.size() - 1; i > 0; i--) {
//			 
//			 for (int j = 0; j < i; j++) {
//				 
//				 if (myList.get(j).getITEM_NUMBER() > myList.get(j+1).getITEM_NUMBER()) {
//					 
//					 Clinic_Inventory clinic = myList.get(j);
//					 Clinic_Inventory temp = myList.get(j + 1);
//					 myList.set(j, temp);
//					 myList.set(j + 1, clinic);
//					 temp = myList.get(j);
//					 
//				 }
//			 }
//		 }
//		 System.out.println("List now is sorted!!!");
//		 
//		 for (Clinic_Inventory c : myList) {
//			 System.out.println(c.getITEM_NUMBER());
//		 }
//		 
//		
//	}
//
//}
