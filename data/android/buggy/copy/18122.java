private void sendData(java.lang.String outputData) throws java.io.IOException {
    this.serverOutput.writeBytes((outputData + "\n"));
    serverOutput.flush();
}