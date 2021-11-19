public void setCurrencyServerAvailable(boolean available) {
    com.sun.javafx.application.PlatformImpl.runLater(() -> {
        walletButton.setVisible(available);
        qrCodeButton.setVisible(available);
    });
}