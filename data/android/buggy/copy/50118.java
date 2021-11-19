@org.python.modules.posix.Hide(value = OS.NT)
public static void lchmod(org.python.core.PyObject path, int mode) {
    if ((org.python.modules.posix.PosixModule.posix.lchmod(org.python.modules.posix.PosixModule.absolutePath(path), mode)) < 0) {
        throw org.python.modules.posix.PosixModule.errorFromErrno(path);
    }
}