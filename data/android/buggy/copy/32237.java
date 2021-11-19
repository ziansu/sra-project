@java.lang.Override
public java.lang.Object call(java.lang.Object... arguments) {
    try {
        throw e.throwAsRError();
    } catch (com.oracle.truffle.r.runtime.RError e) {
        return null;
    }
}