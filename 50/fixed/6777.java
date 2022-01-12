private void newPipeRequested(java.nio.channels.AsynchronousSocketChannel majorSocket) {
    mini.relay.Pipe newPipe = new mini.relay.Pipe();
    newPipe.setMajor(majorSocket);
    newPipe.setMajorReady();
    this.initiateOutboundSocket(newPipe);
    this.initiateInboundSocket(newPipe);
}