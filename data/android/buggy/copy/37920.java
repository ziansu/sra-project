@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    retrieveDataFromLocalDatabase();
    setHasOptionsMenu(true);
    setRetainInstance(true);
}