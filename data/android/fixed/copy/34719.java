@java.lang.Override
protected void endStageEvent(it.playfellas.superapp.events.game.EndStageEvent event) {
    android.util.Log.d(it.playfellas.superapp.ui.slave.game3.Slave3Presenter.TAG, "------->EndStageEvent received by the Slave Presenter");
    this.pause();
}