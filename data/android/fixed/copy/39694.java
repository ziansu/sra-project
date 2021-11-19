@java.lang.Override
public void onNext(android.util.Pair<de.elanev.studip.android.app.backend.datamodel.Event, de.elanev.studip.android.app.backend.datamodel.Course> pairs) {
    addEvents(pairs);
}