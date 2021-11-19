@java.lang.Override
public android.os.Parcelable onSaveInstanceState() {
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putCharSequence(net.xpece.material.floatinglabel.FloatingLabelView.SAVED_ORIGINAL_HINT, mOriginalHint);
    bundle.putInt(net.xpece.material.floatinglabel.FloatingLabelView.SAVED_COLOR_ACTIVATED, mColorActivated);
    return super.onSaveInstanceState();
}