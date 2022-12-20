public class Main {
    public static void main(String[] args) {
        Book bookOne = new Book("Война и Мир", "Лев Николаевич Толстой", 1863);

        System.out.println(bookOne.toString());
        System.out.println("Описание книги: " + bookOne.append("Роман-эпопея. Описывающий русское общество в эпоху войн против Наполеона в 1805-1812 годах."));

        bookOne.up();
        System.out.println("Рейтинг книги " + bookOne.nameBook + "=" + bookOne.rating);
        bookOne.down();
        System.out.println("Рейтинг книги " + bookOne.nameBook + "=" + bookOne.rating);

        System.out.println();

        Book bookTwo = new Book("Мастер и Маргарита", "Михаил Афанасьевич Булгаков", 1937);
        System.out.println(bookTwo.toString());

        System.out.println("Описание книги: " + bookTwo.append("Задуман как произведение о противостоянии зла и добра. "));
    }
}
