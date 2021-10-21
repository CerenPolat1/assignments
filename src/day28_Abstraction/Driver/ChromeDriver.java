package day28_Abstraction.Driver;

public class ChromeDriver extends Driver{
    //    //after extending Driver class below method will be inherited
    //             // abstract void openBrowser();
    //             //abstract void getURL(String url);
    //             //void closeBrowser(){


    // kolayca overringleri cekmek icin soyle de yapabilirsin:
    //ChromeDriver'in ustune gel ve implement methods yaziyor onu tiklayinca sana absract olanlari overriding olarak verir
    public final String driverName="Chrome";
    @Override
    public void openBrowser() {
        System.out.println(driverName + " is opening ");
    }

    @Override
    public void getURL(String url) {
        System.out.println("Opening "+url + " in " + driverName);
    }




}