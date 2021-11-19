public void sendMessage(java.lang.String msg) {
    try {
        client.view.Printer.print(msg);
        out.write(msg);
        out.newLine();
        out.flush();
    } catch (java.io.IOException e) {
        client.view.Printer.print("Lost connection. (Maybe you were kicked...?)");
    }
}