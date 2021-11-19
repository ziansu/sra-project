@java.lang.Override
protected void onResume() {
    super.onResume();
    be.marche.ac.apptravaux.lib.TravauxUtils.refreshFragment(be.marche.ac.apptravaux.MainActivity.FRAGMENT_ACCOUNT, fragmentManager);
}