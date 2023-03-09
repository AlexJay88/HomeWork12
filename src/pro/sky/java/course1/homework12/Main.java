package pro.sky.java.course1.homework12;



public class Main {


    public static void main(String[] args) {

        Author LevTolstoy = new Author("Lev", "Tolstoy");
        System.out.println("LevTolstoy.name = " + LevTolstoy.getName());
        System.out.println("LevTolstoy.surname = " + LevTolstoy.getSurname());
        System.out.println(LevTolstoy);
        Author a = new Author("Lev", "Tolstoy");
        Author a2 = new Author("Lev", "Tolstoy");
        System.out.println(a.equals(a2));









        Book WarAndPeace = new Book("WarAndPeace", 1867 , LevTolstoy);
        System.out.println("WarAndPeace.author =  " + WarAndPeace.author.getName() + WarAndPeace.author.getSurname());
        System.out.println("WarAndPeace.name = " + WarAndPeace.getName());
        System.out.println("WarAndPeace.year = " + WarAndPeace.getYear());
        WarAndPeace.setYear(1869);
        System.out.println("WarAndPeace.getYear() = " + WarAndPeace.getYear());
        System.out.println(WarAndPeace);
        Book b = new Book("WarAndPeace",1867,LevTolstoy);
        Book b2 = new Book("WarAndPeace",1867,LevTolstoy);


        System.out.println(b.equals(b2));








    App lolita = new App("Lolita", "Nabokov");
        System.out.println("lolita.bookTitle = " + lolita.getBookTitle());
        System.out.println("lolita.author = " + lolita.getAuthor());


        App leviathan = new App("leviathan", "Hobbes");
        System.out.println("leviathan.bookTitle = " + leviathan.getBookTitle());
        System.out.println("leviathan.author = " + leviathan.getAuthor());


    }



}
