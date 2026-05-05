class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        k = k % size;
        if (k == 0) return head;

        int[] arr = new int[size];
        temp = head;
        int i = 0;
        while (temp != null) {
            arr[i++] = temp.val;
            temp = temp.next;
        }

        int[] ans = new int[size];
        int idx = 0;

        for (int a = size - k; a < size; a++) {
            ans[idx++] = arr[a];
        }

        for (int a = 0; a < size - k; a++) {
            ans[idx++] = arr[a];
        }

        temp = head;
        int p = 0;
        while (temp != null) {
            temp.val = ans[p++];
            temp = temp.next;
        }

        return head;
    }
}
