

public class Main {
    public static void main(String[] args) {
        LL l = new LL();
        l.insertAtFirstPosition(3);
        l.insertAtFirstPosition(4);
        l.insertAtFirstPosition(5);
        l.insertAtFirstPosition(17);
        l.insertAtFirstPosition(20);

        l.display();

        System.out.println("the element found at "+l.findElement(5)+" position");


        l.insertAtLastPosition(99);
        l.display();

        l.insertAtIndex(50, 3); // Insert 50 at index 3
        l.display();

        l.deleteAtFirst();
        l.display();
        System.out.println(l.deleteAtFirst());

        l.deleteAtLast();
        l.display();
        System.out.println(l.deleteAtLast());
        l.display();

        l.deleteAtIndex(3);
        l.display();
        System.out.println(l.deleteAtIndex( 2));

    }
}
