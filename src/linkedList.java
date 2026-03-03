public class linkedList {
    private int size;
    linkedList(){
        this.size = 0;
    }

    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next = next;
            size++;
        }
    }

    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head == null){
            head =newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if (head == null){
            newNode.next =head;
            return;
        }
        Node currNode= head;
        while (currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public  void printList(){
        if (head == null){
            System.out.println("list is empty");
            return;
        }
        Node currNode= head;
        while (currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }
    public void removeFirst(){
        if (head==null){
            System.out.println("nothing to delete");
            return;
        }
        size--;
        head=head.next;
    }
    public  void removeLast(){

        if (head==null){
            System.out.println("nothing to delete");
            return;
        }
        size--;
        if (head.next==null){
            head =null;
            return;
        }
        Node secondLast= head;
        Node lastNode = head.next;
        while (lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast = secondLast.next;

        }
        secondLast.next=null;
    }

    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        linkedList list =new linkedList();
        list.addFirst("linked");
        list.addFirst("a");

        list.addFirst("is");
list.addLast("list");
list.addFirst("this");
        list.printList();
        list.removeFirst();
        list.printList();
        list.removeLast();
        list.printList();
        System.out.println(list.getSize());

    }

}

