public final synchronized void end() {
    if (!(started)) {
        return ;
    }
    finishProgressBar(false);
    if (iOwnOutput) {
        com.github.tomaslanger.cli.progress.StreamHandler.replaceBack();
    }
    iOwnOutput = false;
    started = false;
}