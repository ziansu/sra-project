@java.lang.Override
public java.lang.CharSequence getPageTitle(int position) {
    java.lang.String[] mTitles = new java.lang.String[]{ getString(R.string.task) , getString(R.string.project) , getString(R.string.note) };
    return mTitles[position];
}