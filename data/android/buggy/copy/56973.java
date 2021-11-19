public void send(java.lang.String sendMessage) {
    if (sendMessage != null) {
        output.write(sendMessage);
        output.flush();
    }
    java.lang.System.out.println(("Message sent: " + sendMessage));
}