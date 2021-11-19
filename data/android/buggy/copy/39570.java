@org.testng.annotations.AfterMethod
public void tearDown() {
    this.callbackCreatePrimary = null;
    this.callbackListChildren = null;
    this.callbackGetDataWatcher = null;
    this.callbackGetData = null;
    this.control = null;
    this.connection = null;
    this.listener = null;
}