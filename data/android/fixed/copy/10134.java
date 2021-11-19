@java.lang.Override
public boolean execute() {
    reload();
    if (org.bbop.apollo.gwt.client.TrackPanel.trackInfoList.isEmpty()) {
        return true;
    }
    return false;
}