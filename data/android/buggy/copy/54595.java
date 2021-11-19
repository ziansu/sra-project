@java.lang.Override
public io.github.theangrydev.sandbox.zdd.ZDD removeAllElementsIn(io.github.theangrydev.sandbox.zdd.ZDD zdd) {
    if (zdd == (io.github.theangrydev.sandbox.zdd.ZeroZDD.ZERO_ZDD)) {
        return io.github.theangrydev.sandbox.zdd.ZeroZDD.ZERO_ZDD;
    }else {
        return this;
    }
}