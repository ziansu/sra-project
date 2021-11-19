public void receive(actors.EchoText message) {
    mail_box.add(message);
    process_next_message();
}