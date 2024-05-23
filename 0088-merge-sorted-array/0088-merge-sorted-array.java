class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
     int m1=m-1, n1=n-1, mn=m+n-1;
     while(m1>=0 && n1>=0){
        if(nums1[m1] > nums2[n1]){
            nums1[mn] = nums1[m1];
            m1--;
        }
        else{
            nums1[mn] = nums2[n1];
            n1--;
        }
        mn--;
     }
     while(n1>=0){
        nums1[mn]=nums2[n1];
        n1--;
        mn--;
     }
    }
}


//two pointer approach
//1 2 3 0 0 0       2 5 6

//p1=m-1 p2=n-1
//6>3 so it will go at the end of the array 1 2 3 0 0 6
//nums2[p2]>num1[p1]
//nums1[i]=num2[p2]

//indexes are decremented