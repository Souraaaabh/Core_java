//Question: Detect Cycle in Linked List
//
//Given:
//
//public boolean hasCycle(ListNode head)
//
//Return true if the linked list contains a cycle, otherwise false.
//
//Example 1 (Cycle exists)
//        1 → 2 → 3 → 4
//        ↑     ↓
//        ← ← ← ←
//
//Return: true
//
//Example 2 (No cycle)
//        1 → 2 → 3 → 4 → null
//
//Return: false
//
//        🚫 Constraints
//
//You cannot modify the list.
//
//Try to solve in O(n) time.
//
//Extra space should be O(1).

class ListNode { int val;
   ListNode next;
   ListNode() {}
   ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class DetectCycleInLL  {
    public static boolean hasCycle(ListNode head){

        ListNode slow;
        ListNode fast ;


        return false;
    }

    public static void main(String[] args) {

    }
}
