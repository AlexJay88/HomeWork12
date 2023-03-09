package pro.sky.java.course1.homework12;

import java.time.Year;

public class Book {
    public String name;
    public int year;

    Author author;

    public Book(String name, int year, Author author) {
        this.name = name;
        this.year = year;
        this.author = author;


    }

    public String getName() {

        return this.name;
    }

    public int getYear() {

        return this.year;

    }
    public Author getAuthor(){
         return this.author;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public String toString() {


        return "Имя " + this.name + " Год " + this.year + " " + this.author;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Book WarAndPeace = (Book) o;

        if (getYear() != WarAndPeace.getYear()) {
            return false;

        }
        if (getName() != WarAndPeace.getName()) {
            return false;
        }

        if (getAuthor() != WarAndPeace.getAuthor()) {
            return false;
        }
        return getName() != null
                ? getName().equals(WarAndPeace.getName())
                : WarAndPeace.getName() == null;

    }



    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, year,author);
    }

}

















