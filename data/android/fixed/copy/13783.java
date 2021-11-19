@java.lang.Override
public boolean isShuffleComplete() {
    shuffleComplete = isTaskComplete(shuffleComplete, shuffleTasks);
    return shuffleComplete;
}