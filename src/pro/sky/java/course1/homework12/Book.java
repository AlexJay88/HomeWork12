package pro.sky.java.course1.homework12;

public class Book {
    private String name;
    private int year;

    private String author;


    public Book(String name, int year,String author) {
        this.name = name;
        this.year = year;
        this.author=author;
    }

    public String getName(){

        return this.name;
    }


    public int getYear(){

        return this.year;

    }


    public String getAuthor(){
        return this.author;
    }

    public void setYear(int year) {
        this.year= year;
    }
    }




