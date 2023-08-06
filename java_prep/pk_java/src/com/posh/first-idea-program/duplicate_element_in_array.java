package com.posh;

public class duplicate_element_in_array {
    public static void main(String[] args) {
        int[] arr ={1,2,3};
        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] arr) {
        int k=0;
        for(int i =0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]==arr[i]){
                    arr[j]=-101;
                    k=j+1;
                }
                else{
                    j=arr.length;
                }
            }
//            if(i==arr.length -1 ){
//                i=k;
//            }
//            else if(i==0){
//                i=k+1;
//                k=i;
//            }
//            else {
//                i = k - 1;
//            }


        }
        int l=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=-101){
                arr[l]=arr[i];
                l++;
            }
        }
        return l;
    }
}
