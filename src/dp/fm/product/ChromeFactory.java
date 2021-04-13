package dp.fm.product;

public class ChromeFactory implements BrowserFactory{
    @Override
    public BrowserHandler createBrowserHandler() {
        return new ChromeHandler();
    }
}
