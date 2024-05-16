class Film {
    int id;
    String title;
    double rating;
    Film next;
    Film prev;

    Film(int id, String title, double rating) {
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}


