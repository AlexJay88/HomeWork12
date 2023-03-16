package pro.sky.java.course1.homework12;

public class Author {
     private String name;
   private String surname;


    public Author(String name, String surname) {

        this.name = name;
        this.surname = surname;


    }

    public String getName() {

        return this.name;
    }


    public String getSurname() {

        return this.surname;

    }

    @Override
    public String toString() {
        return "Имя " + this.name + " Фамилия " + this.surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author that = (Author) o;
        return name.equals(that.name) && surname.equals(that.surname);


    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, surname);
    }


}


