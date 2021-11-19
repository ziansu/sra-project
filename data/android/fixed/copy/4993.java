void sendMessage(me.legrange.swap.SwapMessage msg) {
    synchronized(out) {
        out.write(me.legrange.swap.tcp.TcpTransport.MESSAGE_START);
        out.write(msg.getText());
        out.write("\n");
        out.flush();
    }
}