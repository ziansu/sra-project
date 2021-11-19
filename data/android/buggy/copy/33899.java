public void dispose() {
    Team4450.Lib.Util.consoleLog(gamePadName);
    monitorGamePadThread.interrupt();
}