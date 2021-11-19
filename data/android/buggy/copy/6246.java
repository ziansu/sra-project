@java.lang.Override
public boolean test(@io.reactivex.annotations.NonNull
java.lang.Long aLong) throws java.lang.Exception {
    return (!(com.fionera.multipic.common.LocalImageHelper.isRunning)) && (!(com.fionera.multipic.common.LocalImageHelper.instance.isInitialized()));
}