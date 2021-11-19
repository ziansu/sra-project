private void sendData(java.lang.String outputData) throws java.io.IOException {
    serverOutput.writeBytes((outputData + "\n"));
    serverOutput.flush();
}