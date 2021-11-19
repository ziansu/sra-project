private void sendCommand(java.lang.String cmd) {
    synchronized(out) {
        out.write(me.legrange.swap.tcp.TcpTransport.COMMAND_START);
        out.write(cmd);
        out.write("\n");
        out.flush();
    }
}