@java.lang.Override
public void onFailure(java.lang.Throwable e) {
    throw new de.ludwig.smt.SmartTrashException("Exception while preparing smarttrash es index", e);
}