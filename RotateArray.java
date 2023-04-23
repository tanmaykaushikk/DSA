package CODING_BLOCKS;



// public class RotateArray {
//     public static void RotateArr(int arr[],int k){
//         k = k%arr.length;
//         for(int j=1;j<=k;j++){
//         int temp = arr[arr.length-1];
//         for(int i=arr.length-2;i>=0;i--){
//             arr[i+1] = arr[i];
//         }
//         arr[0]=temp;
//     }
// }



   
//     public static void main(String[] args) {
//         int [] arr = {1,2,3,4,5,6,7};
//         int k = 3;

//         RotateArr(arr, k);
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]);
//         }
        
//     }
// }


// time limit exceeded in leet code.

// public class RotateArray{

//     public static void Reverse(int arr[],int start,int end){

//         while(start<end){
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;

//             start++;
//             end--;

//         }
//     }

//     public static void RotateArr(int arr[],int k ){
//         k = k%arr.length;
//         int n = arr.length;
//         Reverse(arr,0,n-1);
//         Reverse(arr,0,k-1);
//         Reverse(arr,k,n-1);
//     }
//     public static void main(String[] args) {
//         int [] arr = {1,2,3,4,5,6,7};
//         int k = 3;
//         RotateArr(arr, k);
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]);
//         }
//     }
// }
