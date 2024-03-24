class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowIdx = searchPotentialRow(matrix, target);
        if(rowIdx != -1) return binarySearchOverRow(rowIdx, matrix, target);
        else return false;
    }
    private int searchPotentialRow(int[][] matrix, int target){
        int low=0;
        int high=matrix.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;

            if(matrix[mid][0] <= target && target <= matrix[mid][matrix[0].length-1]){
                return mid;
            }
            else if (matrix[mid][0] < target) low=mid+1;
            else if(matrix[mid][0] > target) high=mid-1;
        }
        return -1;
    }

    private boolean binarySearchOverRow(int rowIdx, int[][] matrix, int target){
        int low=0;
        int high=matrix[rowIdx].length-1;
        while(low<=high){
            int mid = low+(high-low)/2;

            if(matrix[rowIdx][mid] == target) return true;
            else if(matrix[rowIdx][mid] > target) high=mid-1;
            else low=mid+1;
        }
        return false;
    }
}

//will be finding potential row to apply binary search 
//later will apply binarry seary or searchPotential row to check exactly the potential row 
//will apply binary serch in 1st column and will get to know the potential row 
//as it is sorted so 23 is less than 10 so it will be present in 1st column 
//so will be applying binary serch in row 1 and will get the target 