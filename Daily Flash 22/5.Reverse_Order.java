/*
Program 5: Write a Program that takes an array as input from the user and prints the array in reverse order.
*/

class Reverse_Array {
 
    static void reverse(int a[], int n)
    {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }
  
        System.out.print("Reversed array is: ");
        for (int k = 0; k < n; k++) {
            System.out.print(b[k]+" ");
        }
    }
  
    public static void main(String[] args)
    {
        int [] arr = {1,2,3,4,5,6,7,8};
        reverse(arr, arr.length);
    }
}

/*
Input: 1 2 3 4 5 6 7 8
Output: 8 7 6 5 4 3 2 1
*/
