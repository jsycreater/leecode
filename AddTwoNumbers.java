public class AddTwoNumbers {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result=new ListNode(0);
        int sum=0;
        int carry=0;
        ListNode p0=result,p1=l1,p2=l2;
        while(p1!=null||p2!=null){
            int x=(p1!=null)?p1.val:0;
            int y=(p2!=null)?p2.val:0;
            sum=carry+x+y;
            carry=sum/10;
            p0.next=new ListNode(sum%10);
            p0=p0.next;
            if(p1!=null) p1=p1.next;
            if(p2!=null) p2=p2.next;
        }
        if(carry>0)
            p0.next=new ListNode(1);
        return result.next;

    }
}
