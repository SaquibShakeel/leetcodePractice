class Solution {
    public int countOperations(int num1, int num2) {
        return helper(num1, num2);
    }
    
    int helper(int n1, int n2) {
        if(n1 == 0 || n2 == 0){
            return 0;
        }
        if(n1 >= n2) {
            return 1+helper(n1 - n2, n2);
        }
        else{
            return 1+helper(n1, n2 - n1);
        }
    }
    
}