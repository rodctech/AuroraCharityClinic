package finalProject;


public class BinarySearch {
    public int binarySearch(Clinic_Inventory[] c, int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (c[mid].getITEM_NUMBER() == x)
                return mid;

            if (c[mid].getITEM_NUMBER() > x)
                return binarySearch(c, l, mid - 1, x);

            return binarySearch(c, mid + 1, r, x);
        }

        return -1;
    }
}
