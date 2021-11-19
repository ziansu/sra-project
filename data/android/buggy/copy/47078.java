static java.lang.CharSequence convertToCharacter(org.safs.tools.input.RobotKeyEvent event) {
    java.util.ArrayList<org.safs.tools.input.RobotKeyEvent> list = new java.util.ArrayList();
    list.add(event);
    return org.safs.selenium.webdriver.lib.WDLibrary.keysparser.antiParse(list);
}