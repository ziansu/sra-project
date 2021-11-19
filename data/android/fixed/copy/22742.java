@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
        case 1 :
        case 2 :
        default :
            android.util.Log.e(DEBUGER_TAG, "Out of range position");
    }
    return com.exemple.respectmovement.GiveRespectFragment.newInstance(position);
}