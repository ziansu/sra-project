private void getExtras() {
    android.os.Bundle bundle = getArguments();
    keyword = bundle.getString(com.jds.webapp.Fragment.FragmentListArticle.KEY_WORD);
}