package dp.fm.product;

import java.util.ArrayList;
import java.util.List;

public class BrowserAnalyzer {
    private List<BrowserHandler> browsers = new ArrayList<>();

    public void addBrowserHandler (BrowserHandler browserHandler){
        browsers.add(browserHandler);
    }
}
