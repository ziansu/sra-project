@java.lang.Override
public void onResume() {
    super.onResume();
    new se.umu.cs.pvt151.search.SearchRegularFragment.AnnotationsTask().execute();
}