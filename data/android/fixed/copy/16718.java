public final void run() {
    --(remainingTime);
    observer.updateTime(remainingTime);
    if ((remainingTime) <= 0) {
        observer.stopLevel();
    }
}