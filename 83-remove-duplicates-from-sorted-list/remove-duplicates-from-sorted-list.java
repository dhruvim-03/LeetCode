class Solution {
   public ListNode deleteDuplicates(ListNode head) {
   ListNode slow=head;
 while(slow!=null&&slow.next!=null){
    if(slow.val==slow.next.val){
        slow.next=slow.next.next;

    }else{
        slow=slow.next;
    }

 }
 return head;
}
}