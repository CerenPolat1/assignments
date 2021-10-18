
package day26_owerwriting.FacebookLogin;

import myMethods.myLibraryMethods;

public class FacebookLoginObjects {

    public static void main(String[] args) {
        FacebookLogin obj1=new FacebookLogin();

        //obj1.username = " java "; bu sekilde private'a ulasamam sadece get ve set araciligiyla ulasirim
        obj1.setUsername("hello world");
        obj1.setPassword("java is here");

        System.out.println("obj1.getUsername() = " + obj1.getUsername());
        System.out.println("obj1.getPassword() = " + obj1.getPassword());

        myLibraryMethods.stars();

        FacebookLoginChrome chrome=new FacebookLoginChrome();
        chrome.openBrowser();
        chrome.goToUrl();
        chrome.passingCredentials("firas", "java");
        System.out.println("chrome.getUsername() = " + chrome.getUsername());
        System.out.println("chrome.getPassword() = " + chrome.getPassword());
        chrome.closeBrowser();

        myLibraryMethods.stars();
        FacebookLoginFirefox firefox=new FacebookLoginFirefox();
        firefox.openBrowser();
        firefox.goToUrl();
        firefox.passingCredentials("ridvan " ," password123");
        System.out.println("firefox.getUsername() = " + firefox.getUsername());
        System.out.println("firefox.getPassword() = " + firefox.getPassword());
        firefox.closeBrowser();

        myLibraryMethods.stars();

        FacebookLoginEdge edge=new FacebookLoginEdge();
        edge.openBrowser();
        edge.goToUrl();
        edge.passingCredentials("bahast " ," hello world");
        System.out.println("edge.getUsername() = " + edge.getUsername());
        System.out.println("edge.getPassword() = " + edge.getPassword());
        edge.closeBrowser();

    }
}