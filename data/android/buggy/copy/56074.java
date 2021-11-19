@java.lang.Override
public void update(internetofeveryone.ioe.Data.DataType type, java.lang.String id) {
    java.lang.System.out.println("CONTACTPRESENTER: UPDATE");
    if (type.equals(DataType.CONTACT)) {
        if (isViewAttached()) {
            getView().dataChanged();
        }else {
        }
    }
}