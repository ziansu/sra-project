@java.lang.Override
public android.os.Parcelable onSaveInstanceState() {
    if ((badge) != null) {
        android.os.Bundle bundle = badge.saveState(indexInContainer);
        bundle.putParcelable("superstate", super.onSaveInstanceState());
        return bundle;
    }
    return super.onSaveInstanceState();
}