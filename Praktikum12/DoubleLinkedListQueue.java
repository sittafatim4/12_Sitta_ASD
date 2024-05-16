class DoubleLinkedListQueue {
    Person front, rear;
    int count;

    DoubleLinkedListQueue() {
        this.front = null;
        this.rear = null;
        this.count = 0;
    }

    boolean isEmpty() {
        return front == null;
    }

    void enqueue(int queueNumber, String name) {
        Person newPerson = new Person(queueNumber, name);
        if (rear == null) {
            front = rear = newPerson;
        } else {
            rear.next = newPerson;
            newPerson.prev = rear;
            rear = newPerson;
        }
        count++;
        System.out.println("Nomor antrian " + queueNumber + " atas nama " + name + " telah ditambahkan ke dalam antrian.");
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada yang divaksinasi.");
            return;
        }
        Person temp = front;
        front = front.next;
        if (front != null) {
            front.prev = null;
        } else {
            rear = null;
        }
        System.out.println(temp.name + " telah selesai divaksinasi.");
        count--;
    }

    void printQueue() {
        System.out.println("+++++++++++++++++++++++");
        System.out.println("Daftar Pengantri Vaksin");
        System.out.println("+++++++++++++++++++++++");
        System.out.printf("| %-10s | %-10s |\n", "No.", "Nama");
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        Person temp = front;
        while (temp != null) {
            System.out.printf("| %-10d | %-10s |\n", temp.queueNumber, temp.name);
            temp = temp.next;
        }
        System.out.println("Sisa Antrian: " + count);
    }
}