package pro.sky.java.course1.homework12;



public class Main {





    public static void main(String[] args) {


        Book WarAndPeace = new Book("WarAndPeace", 1867," Lev Tolstoy");
        System.out.println("WarAndPeace.name = " + WarAndPeace.getName());
        System.out.println("WarAndPeace.year = " + WarAndPeace.getYear());
        System.out.println("WarAndPeace.author = " + WarAndPeace.getAuthor());
        WarAndPeace.setYear(1869);
        System.out.println("WarAndPeace.getYear() = " + WarAndPeace.getYear());


        Author LevTolstoy = new Author("Lev", "Tolstoy");
        System.out.println("LevTolstoy.name = " + LevTolstoy.getName());
        System.out.println("LevTolstoy.surname = " + LevTolstoy.getSurname());



       App lolita = new App("Lolita","Nabokov");
        System.out.println("lolita.bookTitle = " + lolita.getBookTitle());
        System.out.println("lolita.author = " + lolita.getAuthor());


        App  leviathan = new App("leviathan","Hobbes");
        System.out.println("leviathan.bookTitle = " + leviathan.getBookTitle());
        System.out.println("leviathan.author = " + leviathan.getAuthor());


    }}





