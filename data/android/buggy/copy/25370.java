@java.lang.Override
public void onStart() {
    super.onStart();
    dan.dit.whatsthat.testsubject.TestSubject.loadInstance(getActivity());
    checkDataState();
    startIntro();
    startInit();
    startSyncing();
}