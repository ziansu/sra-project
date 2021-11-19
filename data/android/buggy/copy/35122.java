private void initDB() {
    me.jclazz.web.demo.support.app.ApplicationStartup.logger.info("Database init start ...");
    configDB();
    importInitData();
    me.jclazz.web.demo.support.app.ApplicationStartup.logger.info("Database init done");
}