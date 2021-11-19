@java.lang.Override
protected uk.org.ubupisoc.fortune.FortuneTeller doInBackground(java.lang.String... params) {
    uk.org.ubupisoc.fortune.FortuneTeller ft = new uk.org.ubupisoc.fortune.FortuneTeller(context, params[0]);
    return ft;
}