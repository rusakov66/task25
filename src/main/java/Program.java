import java.util.ArrayList;
import java.util.Collections;

class Program {

    public static void printList(int arr[], int long_seq[]) {
        for (int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i<long_seq.length; i++) {
            System.out.print(long_seq[i] + ", ");
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }
    // function to calculate minimum
    /* long_seq() returns the length
    of the longest increasing
    subsequence in arr[] of size n */

    static void analong_seqys (int [] arr , int [] long_seq) {
        int max  = 0;
        int indmax  = 0;
        ArrayList<Integer> al = new ArrayList<>();
        for (int i=0; i<long_seq.length; i++) {
            if (long_seq[i]>max) {max = long_seq[i]; indmax = i;}
        }
        System.out.println("Max " + max + " IndMax " + indmax );

        int i = indmax;
        while (i!=0) {
            if (long_seq[i]==max) {
                al.add(arr[i]);
                max = max-1;
            }
            i = i-1;
        }
        Collections.reverse(al);
        System.out.print("Result: ");
        for (int j = 0; j< al.size(); j++) {
            System.out.print(al.get(j) + ", ");
        }
        System.out.println();
    }

    static int long_seq(int arr[], int n) {

        int result = 0;
        int[] long_seq = new int[n];

        /* Initialize long_seq values
        for all indexes */
        for (int i = 0; i < n; i++ )
            long_seq[i] = 1;

        /* Compute optimized long_seq
           values in bottom up manner */
        for (int i = 1; i < n; i++ ) {
            for (int j = 0; j < i; j++)
                if (arr[i] >= arr[j] &&
                        long_seq[i] < long_seq[j] + 1)
                    long_seq[i] = long_seq[j] + 1;
            printList(arr,long_seq);
        }
        /* Pick resultimum of
        all long_seq values */
        for (int i = 0; i < n; i++ )
            if (result < long_seq[i])
                result = long_seq[i];
        analong_seqys(arr,long_seq);
        return result;
    }

    // number of deletions
    static int minimumNumberOfDeletions(int arr[], int n)
    {
        // Find longest  
        // increasing subsequence 
        int len = long_seq(arr, n);
        printList(arr,arr);

        // After removing elements  
        // other than the long_seq, we get 
        // sorted sequence. 
        return (n - len);
    }

    // Driver Code 
    public static void main (String[] args)
    {
        int arr[] = {2, 5, 3, 4, 2, 2, 2, 4, 8, 2, 5, 3, 3, 3, 7};
        int n = arr.length;
        System.out.println("Minimum number of" +
                " deletions = " +
                minimumNumberOfDeletions(arr, n));
    }
}

