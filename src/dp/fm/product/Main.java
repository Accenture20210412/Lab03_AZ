package dp.fm.product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BrowserAnalyzer browserAnalyzer = new BrowserAnalyzer();

        BrowserFactory browserFactory = new FirefoxFactory();
        BrowserHandler browserHandler = browserFactory.createBrowserHandler();

        browserAnalyzer.addBrowserHandler(browserHandler);

        BrowserFactory browserFactory1 = new ChromeFactory();
        BrowserHandler browserHandler1 = browserFactory1.createBrowserHandler();

        browserAnalyzer.addBrowserHandler(browserHandler1);

        List<String> urls = new ArrayList<>();
        urls.add("google.com");
        urls.add("google.pl");

        System.out.println(browserAnalyzer.testBrowsers(urls));
    }
}
