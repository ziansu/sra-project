@java.lang.Override
public void show() {
    if ((peopleRecycleView) != null) {
        peopleRecycleView.update(wumf.com.sharedapps.firebase.observable.ObservablePeopleFirebase.getPeople());
    }
}