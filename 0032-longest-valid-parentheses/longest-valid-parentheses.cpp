class Solution {
public:
    int longestValidParentheses(string s) {
        int n =s.size();
        int open =0;
        int close=0;
        int result=0;
    
        // Left to Right Checking for the Paranthesis.
    
        for(int i =0; i<n; i++){
            if(s[i] == '(' ) open++;
            else close++;
        
        if(open == close){
            result=max(result, open+close);
        }else if(close >open){
            open=0;
            close=0;
        }
    }

        // Right to Left Checking for the Paranthesis.
        open=0;
        close=0;
        for(int i= n-1; i>= 0; i--){
            if(s[i]== '(') open++;
            else close++;
        
        if(open== close){
             result=max(result, open+close);
        }
        else if(open > close){
            open=0;
            close=0;
        }
}
return result;
}
};