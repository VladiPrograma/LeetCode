import com.sun.xml.internal.ws.api.model.wsdl.WSDLPortType;

import java.util.List;

public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(9);
        ListNode listNode2 = new ListNode(1);
        listNode2.next = new ListNode(9);
        listNode2.next.next = new ListNode(9);
        listNode2.next.next.next = new ListNode(9);
        listNode2.next.next.next.next = new ListNode(9);
        listNode2.next.next.next.next.next = new ListNode(9);
        listNode2.next.next.next.next.next.next= new ListNode(9);
        listNode2.next.next.next.next.next.next.next = new ListNode(9);
        listNode2.next.next.next.next.next.next.next.next = new ListNode(9);
        listNode2.next.next.next.next.next.next.next.next.next = new ListNode(9);

        addTwoNumbers(listNode,listNode2);

    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long n = getNumber(l1)+getNumber(l2);
        String s = Long.toString(n);
        ListNode listNode = new ListNode(Integer.parseInt(String.valueOf(s.charAt(s.length()-1))));
        ListNode aux = listNode;
        for (int i=s.length()-2; i>=0; i--){
            aux.next =new ListNode(Integer.parseInt(String.valueOf(s.charAt(i))));
            aux = aux.next;
        }
        return listNode;
    }
    public static long getNumber(ListNode l1) {
        int size = size(l1);
        int[] n1 = new int[size];
        while (l1 != null) {
            n1[size - 1] = l1.val;
            size--;

            l1 = l1.next;
        }

        String s1 ="";
        for (int i=0; i<n1.length; i++){
            s1+=n1[i];
        }
        long f1 = Long.parseLong(s1);
        return f1;

    }

    public static int size(ListNode l1) {
        int size = 1;
        while (l1.next != null) {
            size++;
            l1 = l1.next;
        }
        return size;
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

