package dp.fm.product;

public class OperaFactory implements BrowserFactory {
    @Override
    public BrowserHandler createBrowserHandler() {
        return new OperaHandler();
    }
}
