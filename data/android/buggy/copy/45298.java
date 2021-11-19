public void testConvertParameterToReceiverAddParens() throws java.lang.Exception {
    org.jetbrains.kotlin.idea.refactoring.changeSignature.JetChangeInfo changeInfo = getChangeInfo();
    changeInfo.setReceiverParameterInfo(changeInfo.getNewParameters()[0]);
    doTest(changeInfo);
}