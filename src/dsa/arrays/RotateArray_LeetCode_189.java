package dsa.arrays;
/*
Problem: Rotate Array (LeetCode 189)

Given an array, rotate it to the right by k steps.

Example:
Input: [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
*/
public class RotateArray_LeetCode_189 {
    public static void rotate(int[] arr,int k){
        int n = arr.length;
        if(n==0) return ;
        k = k%n;
        reverse(arr, 0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }
    public static void reverse(int[] arr, int i,int j){
        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void display(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(arr,k);
        display(arr);
    }
}
