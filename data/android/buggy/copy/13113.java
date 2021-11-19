protected void setCOD(java.lang.String value) {
    com.stamps.print.xtraservices.ExtraServiceCODInput cod = new com.stamps.print.xtraservices.ExtraServiceCODInput(driver);
    cod.ensureSendKeys((value + (org.openqa.selenium.Keys.ENTER)));
    testHelper.log(java.lang.String.format("COD value sendKeys to %s.", value));
}