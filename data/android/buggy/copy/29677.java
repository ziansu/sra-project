@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    android.util.Log.d("test", ("Getting " + (mFragments.get(position).getId())));
    return mFragments.get(position);
}