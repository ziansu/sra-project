@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 1 :
            return mMetadataBlankFragment;
        case 2 :
            return itemFragment;
    }
    return itemFragment;
}