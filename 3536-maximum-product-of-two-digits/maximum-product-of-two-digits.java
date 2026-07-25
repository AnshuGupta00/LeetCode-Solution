class Solution {
    public int maxProduct(int n) {
        int s1=Integer.MIN_VALUE;
        int s2=Integer.MIN_VALUE;

        while(n> 0){
            int num= n % 10;

            if(num > s1){
                s2= s1;
                s1 = num;
            } 
            else if(num> s2){
                s2=num;
            }

            n /=10;
        }

        return s2 == Integer.MIN_VALUE ?0 : s1 *s2;
    }   
}