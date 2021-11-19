public void sendWithError(java.net.DatagramPacket dp) throws java.io.IOException {
    if ((gerarProbabilidade()) > (errorProb)) {
        send(dp);
    }
}