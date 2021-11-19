public void setDateOfPrimeVacDateFields() throws java.lang.InterruptedException {
    java.lang.Thread.sleep(org.motechproject.ebodac.uitest.page.BookingAppPrimeVaccinationPage.SLEEP_500);
    findElement(org.motechproject.ebodac.uitest.page.BookingAppPrimeVaccinationPage.PRIME_VAC_DATE_FIELD).click();
    clickWhenVisible(org.motechproject.ebodac.uitest.page.BookingAppPrimeVaccinationPage.NEXT_MONTH_BUTTON);
    clickWhenVisible(org.motechproject.ebodac.uitest.page.BookingAppPrimeVaccinationPage.SCHEDULER_DAY_OF_MONTH);
}