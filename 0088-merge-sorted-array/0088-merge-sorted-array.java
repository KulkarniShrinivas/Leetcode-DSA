class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      int p1=m-1, p2=n-1, i=m+n-1;
      while(p2 >= 0){
        if(p1 >= 0 && nums1[p1] > nums2[p2]){
            nums1[i--]=nums1[p1--];
        } else{
            nums1[i--] = nums2[p2--];
        }
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