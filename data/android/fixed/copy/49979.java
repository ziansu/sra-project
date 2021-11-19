@java.lang.Override
public void seekToBegining() {
    if (!(index.isEmpty())) {
        mCurrentValue = index.first();
        mPosition = 0;
    }
}