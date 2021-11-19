public void showContent() {
    switchState(com.pinocc.progress.ProgressLayout.State.CONTENT, null, java.util.Collections.<java.lang.Integer>emptyList());
    if ((onProgressLintener) != null) {
        onProgressLintener.onStopProgressing();
    }
}