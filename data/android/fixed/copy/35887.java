@java.lang.Override
public boolean shouldShow(net.osmand.plus.OsmandSettings settings, net.osmand.plus.activities.MapActivity activity, java.lang.String tag) {
    return activity.getMyApplication().getAppInitializer().checkPreviousRunsForExceptions(activity, (settings != null));
}