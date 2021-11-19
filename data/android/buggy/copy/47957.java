@io.qameta.allure.Step(value = "Click on link in table and open page")
public java.lang.String clickOnTheLink(java.lang.String row, java.lang.String link) {
    return table.clickOnTheLinkBy(row, link);
}