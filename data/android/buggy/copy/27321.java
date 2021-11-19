public void verifyMaximumTitleCount() {
    commonactions.enterText(driver, subjectText, "jsfhksfhgskghkghkghskgkgksjghkjshgksghksghksghkaghakghakghkghkghakghakdkgasghkaakjsajka");
    int charLimit = commonactions.getText(driver, subjectText).length();
    org.testng.Assert.assertEquals(true, (charLimit == 25));
}