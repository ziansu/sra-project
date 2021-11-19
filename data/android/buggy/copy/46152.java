public void removeCookie(java.lang.String uuid) {
    try {
        statement.executeUpdate((("DELETE FROM PUBLIC.cookie WHERE uuid = '" + uuid) + "';"));
    } catch (java.sql.SQLException e) {
        no.difi.idporten.oidc.proxy.storage.CookieDatabase.logger.warn("SQLException caught in CookieDatabase.removeCookie()");
        e.printStackTrace();
    }
}