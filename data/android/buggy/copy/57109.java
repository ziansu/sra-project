protected void javaToNative(final java.lang.Object object, final org.eclipse.swt.dnd.TransferData transferData) {
    final byte[] bytes = toByteArray(((fr.cm.scorexpress.core.model.impl.ObjStep) (object)));
    if (bytes != null)
        super.javaToNative(bytes, transferData);
    
}