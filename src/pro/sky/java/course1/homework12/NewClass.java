package pro.sky.java.course1.homework12;

public class NewClass {

      String name;
       int year;
     String authorSurname;

    public static void main(String[] args) {
        NewClass newBook = new NewClass();
        newBook.year = 1886;
        newBook.name = "She";
        newBook.authorSurname = "Rider";
        newBook.setYear(1887);

        System.out.println("Книга " + newBook.name + ", год - " + newBook.year + ", автор " + newBook.authorSurname);
    }

public void setYear(int year){
        this.year = year;
}

}


