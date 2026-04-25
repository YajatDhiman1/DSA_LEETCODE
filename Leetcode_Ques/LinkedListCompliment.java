class Solution {
    public int numComponents(ListNode head, int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int ele:nums){
            set.add(ele);
        }
        ListNode ll=head;
        int comp=0;
        boolean t=false;
        while(ll != null){
            if(set.contains(ll.val)){
                t=true;
            }else{
                if(t){
                    comp++;
                }
                t=false;
            }
            ll=ll.next;
        }
        if(t){
            comp++;
        }
        return comp;
    }
}