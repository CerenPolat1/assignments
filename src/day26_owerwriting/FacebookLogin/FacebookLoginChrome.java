package day26_owerwriting.FacebookLogin;

public class FacebookLoginChrome extends FacebookLogin{

    //belows are been inherited from FacebookLogin
    //username,password
    //getters /seetters method
    //openbrowser,gotourl,closebrowser,passcredantials

    @Override
    public void openBrowser(){       // parent'da bu   public void openBrowser(){ //System.out.println("Browser Started");
                                     //seklinde var, biz bunun icine kendimize gore yazdik ve
                                     //  FacebookLoginObject'e chrome.openBrowser(); yazdigimizda alttaki cumleyi aliriz
        System.out.println("Chrome Browser Started");
    }


}