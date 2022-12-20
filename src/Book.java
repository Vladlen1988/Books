public class Book {
    String nameBook;
    String nameAuthor;
    int year;
    int rating;
    String text;

    public Book(String nameBook, String nameAuthor, int year) {
        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
        this.year = year;
        this.rating = 3;
        this.text = "";
    }

    public void up() {
        if (rating < 5) {
            rating++;
        }
    }

    public void down() {
        if (rating > 0) {
            rating--;
        }
    }

    public String append(String moreText) {
        text += moreText;
        return text;
    }

    public String toString() {
        return "Название книги \"" + nameBook + "\"," + " автор " + nameAuthor + ", год " + year + ", рейтинг книги " + rating + ".";
    }
}
