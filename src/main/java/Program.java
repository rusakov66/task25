class Program {

    public static void main(String[] args) {
        Find_Seq aa = new Find_Seq();
        Integer arr[] = {2, 5, 3, 4, 2, 2, 2, 4, 8, 2, 5, 3, 3, 3, 7};
        Integer exp[] = aa.reArray(arr);
        System.out.print("Result array is: ");
        for (int i = 0; i < exp.length; i++)
            System.out.print(exp[i] + ", ");
    }
}
