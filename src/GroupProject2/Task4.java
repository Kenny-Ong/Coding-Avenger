package GroupProject2;

public class Task4 {

    /*
   Provide Implementation for the diagram below. Then
create a test class in which you need to create Objects of
ChromeDriver, FirefoxDrive and SafariDriver classes and
see which methods available to them.
     */
}
interface Webdriver{

    void open();
    void close();
    String getTitle();
}

interface TakesScreenshot{
    void getScreenshot();
}

interface RemoteWebDriverInterface extends Webdriver, TakesScreenshot {
    void navigate();
}

class ChromeDriver implements RemoteWebDriverInterface{

    @Override
    public void open() {
        System.out.println("Open Chrome Browser");
    }

    @Override
    public void close() {
        System.out.println("Close Chrome Browser");
    }

    @Override
    public String getTitle() {
        String chrome = "Google homepage";
        return chrome;
    }

    @Override
    public void getScreenshot() {
        System.out.println("Screenshot of Chrome Browser");
    }

    @Override
    public void navigate() {
        System.out.println("This a navigate method for Chrome");
    }
}
class FirefoxDriver implements RemoteWebDriverInterface {

    @Override
    public void open() {
        System.out.println("Open Firefox Browser");
    }

    @Override
    public void close() {
        System.out.println("Close Firefox Browser");
    }

    @Override
    public String getTitle() {
        String firefox = "Google homepage";
        return firefox;
    }

    @Override
    public void getScreenshot() {
        System.out.println("Screenshot of Firefox Browser");
    }

    @Override
    public void navigate() {
        System.out.println("This a navigate method for Firefox");
    }
}
class SafariDriver implements RemoteWebDriverInterface{

    @Override
    public void open() {
        System.out.println("Open Safari Browser");
    }

    @Override
    public void close() {
        System.out.println("Close Safari Browser");
    }

    @Override
    public String getTitle() {
        String safari = "Google homepage";
        return safari;
    }

    @Override
    public void getScreenshot() {
        System.out.println("Screenshot of Safari Browser");
    }

    @Override
    public void navigate() {
        System.out.println("This a navigate method for Safari");
    }
}