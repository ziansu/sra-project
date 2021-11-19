private static core.Locator btnReportPreview(emerald.portal.enums.ConfigureNew_ConfigReportButton button) {
    return new core.Locator(org.openqa.selenium.By.xpath(((emerald.portal.ConfigureNew_ConfigReport.targetPreviewPath) + (button.getPath()))), ((button.toString()) + " button"));
}