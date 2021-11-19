@java.lang.Override
public void freeze() {
    mObjects = frozen(mObjects);
    super.freeze();
}