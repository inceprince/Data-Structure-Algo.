package Array.LinearSearch;
//1.Search the element and return the "index"

// public class Searching {
//     public static void main(String[] args) {
//         int [] nums={2,4,6,8};
//         int ans=linearSearch(nums, 6);
//         System.out.println("The 'Index' of the target value is:"+ans);

//     }
//     static int linearSearch(int[] arr, int target){
//         if(arr.length==0){
//             return -1;
//         }
//         for(int index=0;index<arr.length;index++){
//             int element=arr[index];
//             if(element==target){
//                 return index;
//             }
//         }
//         return -1;

//     }
// }

//2.Search the element and the the "element"
public class Searching {

    public static void main(String[] args) {
        int[] nums = { 2, 4, 6, 8 };
        int ans = linearSearch(nums, 10);
        System.out.println(" the target element is:" + ans);

    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return arr[i];
            }
        }
        return -1;
    }
}
