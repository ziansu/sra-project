public void setCleaningService(int numOfTeams, int price, int secondsPerAutoClean) {
    theLogger.log(java.util.logging.Level.INFO, "In GasStation()::setCleaningService()", this);
    cleanService = new bl.CleaningService(numOfTeams, price, secondsPerAutoClean);
}