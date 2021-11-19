public void onDisable() {
    log("All credits for this plugin go to Koenn");
    try {
        if (!(me.koenn.ltp.Main.connection.isClosed())) {
            me.koenn.ltp.Main.connection.close();
        }
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}