public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
        ArrayList<Integer> ans = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>();
        int i=0, j=0;
        int n = A.size();
        
        while(j < n){
            while(deque.size()>0 && deque.peekLast() < A.get(j)){
                deque.removeLast();
            }
            deque.addLast(A.get(j));
            
            if(j-i+1 == B){
                ans.add(deque.peekFirst());
                if(A.get(i) == deque.peekFirst()){
                    deque.removeFirst();
                }
                i++;
            }
            j++;
        }
        
        if(B > n)
            ans.add(deque.peekFirst());
        
        return ans;
    }
}
