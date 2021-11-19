final void setOnRunning(javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent> value) {
    onRunning.set(value);
    setEventHandler(javafx.concurrent.WorkerStateEvent.WORKER_STATE_RUNNING, value);
}