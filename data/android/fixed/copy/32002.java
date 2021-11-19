protected void valueCheck(boolean value) {
    if (value) {
        throw com.oracle.truffle.r.runtime.RError.nyi(this, "value == true");
    }
}