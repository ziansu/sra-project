public static void main(java.lang.String[] args) throws java.io.IOException {
    networking.ClientServer cs = new networking.ClientServer(networking.ServerInformation.SERVER_PORT);
    cs.run();
}