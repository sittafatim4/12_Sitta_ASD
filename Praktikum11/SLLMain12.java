public class SLLMain12 {
    public static void main(String[] args) {
        LinkedList12 myLinkedList12 = new LinkedList12();
        myLinkedList12.print();
        myLinkedList12.addFirst(800);
        myLinkedList12.print();
        myLinkedList12.addFirst(700);
        myLinkedList12.print();
        myLinkedList12.addLast(500);
        myLinkedList12.print();
        myLinkedList12.insertAfter(700, 300);
        myLinkedList12.print();

        myLinkedList12.insertAt(3, 400);
        myLinkedList12.print();

        System.out.println("Data pada index ke-1: " + myLinkedList12.getData(1));
        System.out.println("Data 300 berada pada index ke: " + myLinkedList12.indexOf(300));

        myLinkedList12.remove(300);
        myLinkedList12.print();
        myLinkedList12.removeFirst();
        myLinkedList12.print();
        myLinkedList12.removeLast();
        myLinkedList12.print();

        myLinkedList12.insertBefore(800, 900); 
        myLinkedList12.print();

        myLinkedList12.insertAt(1, 1000); 
        myLinkedList12.print();

        myLinkedList12.removeAt(1); 
        myLinkedList12.print();
    }    
}
