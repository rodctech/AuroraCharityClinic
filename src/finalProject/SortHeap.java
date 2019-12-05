package finalProject;


import java.util.ArrayList;

public class SortHeap {
    public ArrayList<Employee> sort(ArrayList<Employee> b) {
        //Used here to sort by height!
        int n = b.size();

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(b, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            Employee temp = b.get(0);
            b.set(0, (b.get(i))); // arr[0] = arr[i];
            b.set(i, temp); // arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(b, i, 0);
        }
        return b;
    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(ArrayList<Employee> b, int n, int i) {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && b.get(l).getID_NUMBER() > b.get(largest).getID_NUMBER())
            largest = l;

        // If right child is larger than largest so far
        if (r < n && b.get(r).getID_NUMBER() > b.get(largest).getID_NUMBER())
            largest = r;

        // If largest is not root
        if (largest != i) {
            Employee swap = b.get(i);
            b.set(i, b.get(largest));
            b.set(largest, swap); // arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(b, n, largest);
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
