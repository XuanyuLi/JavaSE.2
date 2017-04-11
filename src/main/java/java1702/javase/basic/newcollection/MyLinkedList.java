package java1702.javase.basic.newcollection;


/**
 * Created by lixuanyu
 * on 2017/4/11.
 */
public class MyLinkedList {
    private Node first;
    private Node last;

    public MyLinkedList() {
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("a");
        myLinkedList.add("b");
        myLinkedList.add("c");
        System.out.println(myLinkedList.first());
        System.out.println(myLinkedList.last());
    }

    public String get(int index) {
        Node node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return null;
    }

    public String first() {
        return first.element;
    }

    public String last() {
        return last.element;
    }

    public boolean add(String element) {
        if (first == null) {
            Node node = new Node(element, null, null);
            first = node;
            last = node;

        } else {
            Node node = new Node(element, last, null);
            last.next = node;
            last = node;
        }

        return true;
    }

    private class Node {//node 节点
        String element;
        Node prev; //previous 以前的
        Node next;

        public Node(String element, Node prev, Node next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }
    }
}
