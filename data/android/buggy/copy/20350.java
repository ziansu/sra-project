public void stop() throws java.lang.Exception {
    lmdb.db.JdbcDataManager.stop();
    lmdb.basex.LmdbDataManager.stop();
    lmdb.server.XQueryServer.server.stop();
    lmdb.server.XQueryServer.logger.info("stop");
}