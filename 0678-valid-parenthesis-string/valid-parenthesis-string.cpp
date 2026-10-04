class Solution {
public:
    bool checkValidString(string s,int i,int balance) {
        if(balance <0){
            return 0;
        }
        if(i == s.size()){
            return balance == 0;
        } 

        if(s[i] == '('){
            return checkValidString(s,i+1, balance+1);
        }
        if(s[i] == ')'){
            return checkValidString(s,i+1, balance-1);
        }     
    
    return checkValidString(s,i+1, balance+1) ||
           checkValidString(s,i+1, balance-1) ||
           checkValidString(s,i+1, balance);
}
    bool checkValidString(string s){
       return checkValidString(s,0,0);
    }
};