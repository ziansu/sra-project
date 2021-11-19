protected void startTask() {
    runTaskTimerAsynchronously(org.bitbucket.ucchy.undine.UndineMailer.getInstance(), (20 * 60), ((20 * 60) * 60));
}