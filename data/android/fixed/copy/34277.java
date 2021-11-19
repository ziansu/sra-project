@org.junit.Test
public void inMessageMenuReturnToMailboxMenu() {
    java.lang.String MAILBOX_MENU_TEXT = "Enter 1 to listen to your messages\n" + ("Enter 2 to change your passcode\n" + "Enter 3 to change your greeting");
    phone.speak(MAILBOX_MENU_TEXT);
    connection.dial("4");
    assert connection.isInMailBoxMenu();
    verify(phone).speak(MAILBOX_MENU_TEXT);
}