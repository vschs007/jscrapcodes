package test;

import java.util.Arrays;

public class nearestsum {
    public static void main(String[] args) {
        int x = 32;
        int arr[] ={23,45,1,3,6,4};
        Arrays.sort(arr);
        int l =0;
        int ans1 = -1;
        int ans2=-1;
        int r = arr.length-1;
        int maxdiff = Integer.MAX_VALUE;
        while(l<r){
            int diff = Math.abs(arr[l]+arr[r] - x);
            if(diff  < maxdiff){
                maxdiff = diff;
                 ans1 = arr[l];
                 ans2 = arr[r];
            }
            if(arr[l]+arr[r] > x){
                r-=1;
            }
            else {
                l+=1;
            }


        }

        System.out.println(ans1);
        System.out.println(ans2);
    }
}
