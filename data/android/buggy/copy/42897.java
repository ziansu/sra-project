public static synchronized void set(java.lang.String path, com.thoughtworks.selenium.Selenium selenium) {
    java.util.Map<java.lang.String, com.thoughtworks.selenium.Selenium> map = org.beangle.webtest.better.SeleniumStore.pathToSeleniums.get();
    map.put(path, selenium);
}