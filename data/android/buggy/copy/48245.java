@com.android.tools.layoutlib.annotations.LayoutlibDelegate
static void native_getValues(long native_object, float[] values) {
    android.graphics.Matrix_Delegate d = android.graphics.Matrix_Delegate.sManager.getDelegate(native_object);
    if (d == null) {
        return ;
    }
    java.lang.System.arraycopy(d.mValues, 0, d.mValues, 0, android.graphics.Matrix_Delegate.MATRIX_SIZE);
}