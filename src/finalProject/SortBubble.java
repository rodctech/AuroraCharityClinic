package finalProject;


public class SortBubble {
	 public Clinic_Inventory[] bubbleSort(Clinic_Inventory [] c)
	    {
	        int n = c.length;
	        for (int i = 0; i < n-1; i++)
	            for (int j = 0; j < n-i-1; j++)
	                if (c[j].getITEM_NUMBER() > c[j+1].getITEM_NUMBER())
	                {
	                    // swap temp and arr[i]
	                    Clinic_Inventory temp = c[j];
	                    c[j] = c[j+1];
	                    c[j+1] = temp;
	                }
	        return c;
	    }

}
