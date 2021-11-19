@java.lang.Override
public void update(internetofeveryone.ioe.Data.DataType type) {
    if (type.equals(DataType.CONTACT)) {
        if (isViewAttached()) {
            getView().dataChanged();
        }
    }
}