private void countdownCancel() {
    getServer().getScheduler().cancelTask(countdownTask);
    countdownTask = -1;
}