@java.lang.Override
public void onServerEnd() {
    startButton.setText("Start");
    if ((onDemandCheckBox.isSelected()) && (started)) {
        startButtonActionPerformed(null);
    }
    clientStatusField.setText("remote connection ended");
}