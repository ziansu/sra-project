private void parseRwBackup(yourselvs.rankwizard.commands.Cmd command) {
    yourselvs.rankwizard.RankWizard.backupManager();
    instance.getMessenger().sendServerMessage("RankWizard has been backed up.");
}