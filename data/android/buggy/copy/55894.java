@java.lang.Override
public void call(java.lang.Object result) {
    d.dismiss();
    listener.onAddFilterEntry(((java.lang.String) (result)));
    editedOrDeletedCall.call(null);
}