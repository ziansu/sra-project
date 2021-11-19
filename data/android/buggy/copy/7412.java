public void exitOnClose() {
    client.sendMessage(new in.bits.sochat.bean.Message(in.bits.sochat.bean.Type.DISCONNECT, client.getUserName(), "", null, receiver));
    this.setVisible(false);
    this.dispose();
    java.lang.System.exit(0);
}