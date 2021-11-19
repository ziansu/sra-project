public void update() throws java.io.IOException, java.lang.ClassNotFoundException, java.sql.SQLException, org.manalith.ircbot.plugin.newCER.Exceptions.FileDoesntSpecifiedException {
    if (this.checkLocalLastRoundExpired()) {
        this.updateLastRound();
        this.updateDataTable();
    }
}