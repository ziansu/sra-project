public void exit() {
    org.eyeseetea.malariacare.layout.score.ScoreRegister.clear();
    unregisterReceiver();
    finishAndGo(org.eyeseetea.malariacare.fragments.DashboardActivity.class);
}