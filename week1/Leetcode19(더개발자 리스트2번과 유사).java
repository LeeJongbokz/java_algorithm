
class Solution {
    
    public ListNode reverseLinkedList(ListNode head){
        
        ListNode node = null;
        
        while(head != null){
            ListNode tmp = new ListNode(head.val);
            tmp.next = node;
            node = tmp;
            head = head.next;
        }
        
        return node;
    }
    
    
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        
        ListNode reversed = reverseLinkedList(head);
        ListNode node = reversed;
        
        if(n == 1){
            node = node.next;
        }else{
            int pos = 2;
            
            while(reversed != null){
                if(n == pos){
                    reversed.next = reversed.next.next;
                    break;
                }else{
                    reversed = reversed.next;
                    pos++;
                }
            }
        }
        
        ListNode answer = reverseLinkedList(node);
        
        return answer;
        
        
        
    }
}
