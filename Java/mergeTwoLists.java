class mergeTwoLists {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { 
            val = x; 
        }
        // Recursively returns a string representation of this node and
        // any other nodes after it, such as "30 -> 20 -> 40".
        public String toString() {
            String result = "" + this.val;
            if (next != null) {
                // there are next node(s) after me
                result += " -> " + next.toString();
            }
            return result;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null){
            return l2;
        } else if (l2 == null){
            return l1;
        } else if (l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(3);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(5);
        ListNode result = mergeTwoLists(list1, list2);
        System.out.println(result.toString());
    }
}

/*class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        else if (l2 == null) {
            return l1;
        }
        else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
        else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }

    }
}*/

/*
Complexity Analysis
Time complexity : O(n + m) O(n+m)

Because each recursive call increments the pointer to l1 or l2 by one 
(approaching the dangling null at the end of each list), 
there will be exactly one call to mergeTwoLists per element in each list. 
Therefore, the time complexity is linear in the combined size of the lists.

Space complexity : O(n + m)O(n+m)

The first call to mergeTwoLists does not return until the ends of both l1 and l2 have been reached,
so n + mn+m stack frames consume O(n + m)O(n+m) space.
*/
