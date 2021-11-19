public int verifyMaximumTitleCount() {
    commonactions.enterText(driver, subjectText, "jsfhksfhgskghkghkghskgkgksjghkjshgksghksghksghkaghakghakghkghkghakghakdkgasghkaakjsajka");
    int charLimit = commonactions.getText(driver, subjectText).length();
    return charLimit;
}