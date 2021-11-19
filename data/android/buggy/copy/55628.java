@java.lang.Override
public void calcData(com.intellij.openapi.actionSystem.DataKey key, com.intellij.openapi.actionSystem.DataSink sink) {
    sink.put(GerritDataKeys.TOOL_WINDOW, gerritToolWindow);
}