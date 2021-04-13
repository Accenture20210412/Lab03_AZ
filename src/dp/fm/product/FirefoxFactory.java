package dp.fm.product;

public class FirefoxFactory implements BrowserFactory{
    @Override
    public BrowserHandler createBrowserHandler() {
        return new FirefoxHandler();
    }
}
