package finalProject;


import java.util.ArrayList;

public class QuickSort {

    int partition(ArrayList<Employee> b, int low, int high) {
        int pivot = b.get(high).getID_NUMBER();
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            // If current element is smaller than or
            // equal to pivot
            if (b.get(j).getID_NUMBER() <= pivot) {
                i++;

                // swap arr[i] and arr[j]
                Employee temp = b.get(i);
                b.set(i, b.get(j));
                b.set(j, temp); // arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        Employee temp = b.get(i + 1);
        b.set(i + 1, b.get(high)); // arr[i + 1] = arr[high];
        b.set(high, temp); // arr[high] = temp;

        return i + 1;
    }

    /*
     * The main function that implements QuickSort() arr[] --> Array to be sorted,
     * low --> Starting index, high --> Ending index
     */
    public ArrayList<Employee> sort(ArrayList<Employee> b, int low, int high) {
        if (low < high) {
            /*
             * pi is partitioning index, arr[pi] is now at right place
             */
            int pi = partition(b, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(b, low, pi - 1);
            sort(b, pi + 1, high);
        }
        return b;
    }

}
