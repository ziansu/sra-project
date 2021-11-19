@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            return itemFragment;
        case 1 :
            return mMetadataBlankFragment;
        default :
            return itemFragment;
    }
}