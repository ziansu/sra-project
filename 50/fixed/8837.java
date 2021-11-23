@java.lang.Override
public void doCheck(org.tanaguru.processor.SSPHandler sspHandler, org.jsoup.select.Elements elements, org.tanaguru.ruleimplementation.TestSolutionHandler testSolutionHandler) {
    checkChildElementPresence(childTextualElementNames, elements, testSolutionHandler);
}