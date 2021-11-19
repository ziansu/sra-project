public void dispose() {
    this.gradleConsole.getProcessDescription().getJob().removeJobChangeListener(this);
}