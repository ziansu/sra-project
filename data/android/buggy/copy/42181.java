private static void startService() {
    com.laudandjolynn.mytv.Main.logger.info("start My TV Program Table Crawler.");
    com.laudandjolynn.mytv.Init.getIntance().init();
    com.laudandjolynn.mytv.Main.logger.info("create everyday crawl task.");
    com.laudandjolynn.mytv.Main.createEverydayCron();
}