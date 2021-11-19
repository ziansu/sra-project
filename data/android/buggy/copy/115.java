@java.lang.Override
public void call(com.limegroup.gnutella.gui.search.SearchManagerSignal s) {
    if (s instanceof com.limegroup.gnutella.gui.search.SearchManagerSignal.Results) {
        onResults(s.token, ((com.limegroup.gnutella.gui.search.SearchManagerSignal.Results) (s)).elements);
    }else {
        onFinished(s.token);
    }
}