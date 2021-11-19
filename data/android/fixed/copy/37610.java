@java.lang.Override
protected void onProgressUpdate(org.empyrn.darkknight.engine.ThinkingInfo... values) {
    getGui().onThinkingInfoChanged(values[0]);
}