/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution{
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) 
        	return null;
        
        return mergeCol(Arrays.asList(lists));
    }
    private ListNode mergeCol(List<ListNode> input) {
        if(input.size() == 1) 
        	return input.get(0);
        
        List<ListNode> result = new ArrayList<>();
        
        List<ListNode> first = input.subList(0, input.size()/2);
        List<ListNode> second = input.subList(input.size()/2, input.size());
        
        Iterator<ListNode> f = first.iterator();
        Iterator<ListNode> s = second.iterator();

        while(f.hasNext()) {
            if(s.hasNext()) {
                result.add(merge(f.next(), s.next()));
            } else 
            result.add(f.next());
        }
        while(s.hasNext()) result.add(s.next());
        
        return mergeCol(result);
        
    }
    
    private ListNode merge(ListNode first, ListNode second) {
        if(second == null) 
        	return first;
        if(first == null) 
        	return second;
        
        ListNode result = new ListNode(-1);
        ListNode head = result;
        
        while(first !=null && second != null) {
            ListNode winner;
            if(first.val < second.val) {
                winner = first;
                first = first.next;
            } else {
                winner = second; 
                second = second.next;
            }
            result.next = winner; 
            result = result.next;
        }
        if(first != null) result.next = first;
        else if(second != null) result.next = second;
        
        return head.next;
    }
}