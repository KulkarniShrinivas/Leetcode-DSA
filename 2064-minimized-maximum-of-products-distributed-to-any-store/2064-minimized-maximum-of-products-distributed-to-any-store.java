class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int l=1;
        int h = Arrays.stream(quantities).max().getAsInt();
        int ans=-1;

        while(l<=h){
            int mid= (l+h)/2;
            if(solve(n, quantities, mid)){
                ans = mid;
                h = mid-1;
            } else{
                l=mid+1;
            }
        }
        return ans;
    }

private boolean solve(int n, int[] quantities, int item){

    if(item == 0) return false;
        int store=0;
        for(int product : quantities){
            store += (product -1)/item+1;
            if(store>n) return false;

        }

        return true;


}

    
}