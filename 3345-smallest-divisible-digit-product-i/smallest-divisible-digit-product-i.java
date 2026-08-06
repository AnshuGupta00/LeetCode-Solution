class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int num =n;
            int product=1;

            while(num >0){
                int dif= num%10;
                product*= dif;
                num/=10;
            }
        
       if(product%t ==0) return n; 
        n++;
    }
    }
}