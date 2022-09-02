class Solution {
    public ListNode reverseList(ListNode head) {
        
         ListNode node = null;
        
         while(head != null){
             ListNode tmp = new ListNode(head.val);
             tmp.next = node;
             node = tmp;
             head = head.next;
         }
        
        return node; 
     
        
    }
}
