public static void main(java.lang.String[] args) {
    webserver.main.Main.sql = new webserver.main.MySQL();
    try {
        webserver.main.Main.server = new webserver.main.HTMLServer(webserver.main.Main.sql);
    } catch (java.lang.Exception ex) {
    }
    webserver.main.Main.server.startServer();
}