@java.lang.Override
public void clicked(int position) {
    if (mSeekBar.isCircle()) {
        mSeekBar.deleteArc(position);
    }
}