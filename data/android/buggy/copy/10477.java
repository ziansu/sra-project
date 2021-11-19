public static void main(java.lang.String[] args) throws java.io.IOException {
    final org.glassfish.grizzly.http.server.HttpServer server = org.mitre.bonnie.cqlTranslationServer.Main.startServer();
    java.lang.System.out.println(java.lang.String.format(("Jersey app started with WADL available at " + "%sapplication.wadl\nHit enter to stop it..."), org.mitre.bonnie.cqlTranslationServer.Main.BASE_URI));
    java.lang.System.in.read();
    server.shutdownNow();
}