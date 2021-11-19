public java.lang.String getSourceCode(java.lang.String expectedSourceCode) {
    helloExampleLink.click();
    if ((body.getText().indexOf(expectedSourceCode)) >= 0)
        return expectedSourceCode;
    
    return "*** NOT FOUND ***";
}