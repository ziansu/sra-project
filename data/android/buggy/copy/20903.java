@java.lang.Override
public void start() {
    setUpContext();
    setUpDataAgent();
    if (isInternetAvailable())
        loadItems();
    else
        onNoInternet();
    
}