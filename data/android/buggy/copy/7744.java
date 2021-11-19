@java.lang.Override
public void onResume() {
    showLoadScreen(se.umu.cs.pvt151.search.SearchRegularFragment.DOWNLOAD_ANNOTATIONS);
    new se.umu.cs.pvt151.search.SearchRegularFragment.AnnotationsTask().execute();
    super.onResume();
}