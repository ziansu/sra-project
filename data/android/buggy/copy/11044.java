@android.webkit.JavascriptInterface
public void showLoadingScreen(boolean isLoading) {
    webModel.setIsLoading(isLoading);
    java.lang.System.out.println("SHOW LOADING SCREEN>>>");
    webModel.notifyObservers();
}