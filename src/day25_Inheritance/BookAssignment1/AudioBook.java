package day25_Inheritance.BookAssignment1;

public class AudioBook extends Book {

    public AudioBook(  String author, String title, double price){
        this.author=author;
        this.title=title;
        this.price=price;
    }

    public void listening(){
        System.out.println(author+"'s "+ title+ " is an Audio Book");
    }


    public void length(){

        System.out.println(author+"'s "+ title+ " lasts 5 hours to listen");
    }


}
