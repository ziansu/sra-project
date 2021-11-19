@java.lang.Override
protected void onProgressUpdate(java.util.ArrayList<edu.yamtest.requester.instances.Explain>... values) {
    if (values != null) {
        target.onExplanationUpdate(values[0]);
    }else {
        target.onTranslateDirectionError();
    }
}