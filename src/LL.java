import java.util.LinkedList;

public class LL {

    public static void main(String[] args) {
        LinkedList<String> list =new LinkedList<>();
        list.addFirst("linked");
        list.addFirst("a");

        list.addFirst("is");
        list.addLast("list");//we can use only add() to add at last
        list.addFirst("this");
        System.out.println(list);
        list.removeFirst();

        list.removeLast();
        System.out.println(list);
        System.out.println(list.size());

    }
}


