public void sendLampCommand(java.lang.String id, int status) {
    java.lang.System.out.println(((("L" + id) + status) + '\n'));
    write(((("L" + id) + status) + '\n'));
}