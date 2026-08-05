class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        //Step 1: Creating Adjency List,
        List<List<Integer>> adjL= new ArrayList<>();
        for(int method=0; method<n; method++) adjL.add(new ArrayList<>());
        for(int[] edge= invocations){
            adjL.get(edge[0]).add(edge[1]);
        }
        //Step 2: Mark Method by reachable by bug Method
        boolean[] isSuspicious=new boolean[n];
        Deque stack= new ArrayDeque<>();
        stack.push(k);
        isSuspicious[k]=true;
        while(!stack.isEmpty()){
    
            int currenMethodd=stack.pop();
            for(int calledMethod:adjL.get(currenMethod)){
                if(!isSuspicious[calledMethod]){
                    isSuspicious[calledMethod]=true;
                    stack.push(calledMethod);
                }
            }
        }
    //Step 3:
    for(int[]edge:  invocations){
        int caller=edge[0], called=edge[1];
        if(!isSuspicious[caller] && isSuspicious[called]){
            List all=new ArrayList<>();
            for(int m=0; m<n; m++){
                return all;
            }
        }
    //step 4:
    List result =new ArrayList<>();
    for(int m =0; m<n; m++){
        if(!isSuspicious[m]) result.add(m);
    }
    }
    return result;
   }
}