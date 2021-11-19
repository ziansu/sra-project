public void loadProgram() {
    android.content.Intent intent = new android.content.Intent(tech.michaeloverman.android.mscount.dataentry.MetaDataEntryFragment.mActivity, tech.michaeloverman.android.mscount.database.LoadNewProgramActivity.class);
    startActivityForResult(intent, tech.michaeloverman.android.mscount.dataentry.MetaDataEntryFragment.REQUEST_NEW_PROGRAM);
}