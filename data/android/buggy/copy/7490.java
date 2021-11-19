@java.lang.Override
public void show() {
    peopleRecycleView.update(wumf.com.sharedapps.firebase.observable.ObservablePeopleFirebase.getPeople());
}