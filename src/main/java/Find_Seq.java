import java.util.ArrayList;
import java.util.Collections;

class Find_Seq {
    ArrayList<Integer> al = new ArrayList<Integer>();

    public static void printList(Integer[] arr, int[] long_seq) {
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

    public  ArrayList<Integer> analong_seqys (Integer[] arr , int [] long_seq) {
        int max  = 0;
        int indmax  = 0;

        for (int i=0; i<long_seq.length; i++) {
            if (long_seq[i]>max) {max = long_seq[i]; indmax = i;}
        }
        System.out.println("Max " + max + " IndMax " + indmax );

        int i = indmax;
        while (i!=-1) {
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
        return al;
    }

    public int long_seq(Integer[] arr, int n) {

        int result = 0;
        int[] long_seq = new int[n];

        /* Initialize long_seq values
        for all indexes */
        for (int i = 0; i < n; i++ )
            long_seq[i] = 1;

        for (int i = 1; i < n; i++ ) {
            for (int j = 0; j < i; j++)
                if (arr[i] >= arr[j] &&
                        long_seq[i] < long_seq[j] + 1)
                    long_seq[i] = long_seq[j] + 1;
           // printList(arr,long_seq); //There was needed for debug
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
    Integer[] reArray(Integer[] arr) {
        // Find longest
        // increasing
        al.clear();
        int n = arr.length;
        int len = long_seq(arr, n);
       // arrayOfStrings = listOfStrings.toArray(new String[listOfStrings.size()]);
        Integer[] ret = al.toArray(new Integer[0]);
        return ret;
    }


}
