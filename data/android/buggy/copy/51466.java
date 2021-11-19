public void sendLampCommand(java.lang.String id, int status) {
    write(((("L" + id) + status) + '\n'));
}