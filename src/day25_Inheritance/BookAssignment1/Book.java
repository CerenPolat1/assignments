package day25_Inheritance.BookAssignment1;

public class Book {

/*
task1
create 3 class  book ,  Audiobook  ,PaperBook
    Audiobook should have
    title,author,price,length
    listen()
    tostring()

    PaperBook should have
    title,author,price,pages
    readBook()
    tostring()
 */


    public String author;
    public String title;
    public double price;

    public String toString(){
        return author+ " / "+ title+ " / Price: "+price;
    }




}
