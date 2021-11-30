import java.util.*;

//  Given two sorted arrays nums1 and nums2 of size m and n respectively,
//  return the median of the two sorted arrays.
//  The overall run time complexity should be O(log (m+n)).
public class MedianOfTwoSortedArrays {


    public static void main(String[] args) {
        int[] n1 = {1000};
        int[] n2 = {1001};
        System.out.println(findMedianSortedArrays(n1, n2));
    }


    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        boolean pair = (nums1.length + nums2.length) % 2 == 0;
        int half = (nums1.length + nums2.length) / 2;
        int i = 0;
        int j = 0;
        double ant = 0;
        if (nums1.length==1&&nums2.length==1){
            return (double)(nums1[0]+nums2[0])/2;
        }
        if (nums1.length==0){
            if (nums2.length%2==0){
                return (double)(nums2[nums2.length/2]+nums2[(nums2.length/2)-1])/2;
            }else{
                return nums2[nums2.length/2];
            }
        }
        if (nums2.length==0){
            if (nums1.length%2==0){
                return (double)(nums1[nums1.length/2]+nums1[(nums1.length/2)-1])/2;
            }else{
                return nums1[nums1.length/2];
            }
        }
        if (nums1.length!=0&&nums2.length!=0)  ant = Math.min(nums1[i], nums2[j]);

        while (i + j < half) {
            if (nums1[i] < nums2[j]&&i+1<nums1.length) {
                ant = nums1[i];
                i++;
            }else if (j+1<nums2.length){
                ant = nums2[j];
                j++;
            }else{
                break;
            }
        }
        if (!pair){
            return Math.min(nums1[i], nums2[j]);
        }else{
            int next;
            if (j>=nums2.length){next = nums1[i];}
            else if (i>=nums1.length){next = nums2[j];}
            else{next=Math.min(nums1[i],nums2[j]);}
            System.out.println(next);
            return (ant+next)/2;
        }
    }
}

