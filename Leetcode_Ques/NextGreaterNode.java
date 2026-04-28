class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        int n = list.size();
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            res[i] = 0;

            for (int j = i + 1; j < n; j++) {
                if (list.get(j) > list.get(i)) {
                    res[i] = list.get(j);
                    break; 
                }
            }
        }

        return res;
    }
}