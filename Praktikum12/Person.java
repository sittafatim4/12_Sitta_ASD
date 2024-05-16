class Person {
    int queueNumber;
    String name;
    Person next;
    Person prev;

    Person(int queueNumber, String name) {
        this.queueNumber = queueNumber;
        this.name = name;
        this.next = null;
        this.prev = null;
    }
}