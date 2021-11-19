@java.lang.Override
public void run() {
    if (((this.modalMessage) != null) && (this.modalMessage.isShowing())) {
        this.modalMessage.appendText(lockmsg);
        this.modalMessage.setEnabled(false);
    }
}