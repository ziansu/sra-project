public void submitTicketWithComment() {
    commonactions.isDisplayed(driver, issueWithDoctor);
    commonactions.clickElement(driver, issueWithDoctor);
    enterTextInCommentBox("This is for testing");
    tapSubmitButton();
}