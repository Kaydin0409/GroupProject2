package com.syntax.project2;

public class ChromeDriver implements RemoteWebDriver {
    
    @Override
    public void navigate() {
        System.out.println("Navigate through Chrome Browser using navigate() with chrome driver");
    }

    @Override
    public void getScreenShot() {
        System.out.println("Get a screen shot of chrome browser");
    }

    @Override
    public void open() {
        System.out.println("Open the Chrome Browser by using .get() with chrome driver");
    }

    @Override
    public void close() {
        System.out.println("Close the Chrome Browser by using .close() with chrome driver");
    }

    @Override
    public String getTitle() {
        System.out.println("Get title of webpage in Chrome Browser using getTitle() with chrome driver");
        return "driver.getTitle()";
    }
}
class FireFoxDriver implements RemoteWebDriver{
    
    @Override
    public void navigate() {
        System.out.println("Navigate through FireFox Browser using navigate() with FireFox driver");
    }

    @Override
    public void getScreenShot() {
        System.out.println("Get a screen shot of FireFox browser");
    }

    @Override
    public void open() {
        System.out.println("Open the FireFox Browser by using .get() with FireFox driver");
    }

    @Override
    public void close() {
        System.out.println("Close the FireFox Browser by using .close() with FireFox driver");
    }

    @Override
    public String getTitle() {
        System.out.println("Get title of webpage in FireFox Browser using getTitle() with FireFox driver");
        return "driver.getTitle()";
    }
}
class SafariDriver implements RemoteWebDriver{
    
    @Override
    public void navigate() {
        System.out.println("Navigate through Safari Browser using navigate() with Safari driver");
    }

    @Override
    public void getScreenShot() {
        System.out.println("Get a screen shot of Safari browser");
    }

    @Override
    public void open() {
        System.out.println("Open the Safari Browser by using .get() with Safari driver");
    }

    @Override
    public void close() {
        System.out.println("Close the Safari Browser by using .close() with Safari driver");
    }

    @Override
    public String getTitle() {
        System.out.println("Get title of webpage in Safari Browser using getTitle() with Safari driver");
        return "driver.getTitle()";
    }
}
