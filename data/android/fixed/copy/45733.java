@com.smcmaster.selftest.annotations.Comparison(inputs = { "2" , "4" }, output = "7", description = "This test fails on purpose")
@com.smcmaster.selftest.annotations.Comparison(inputs = { "-5" , "10" }, output = "5")
@com.smcmaster.selftest.annotations.Comparison(inputs = { SelfTest.NULL_VALUE , "11" }, output = "11", description = "Test a null input")
public int sum(java.lang.Integer first, int second) {
    if (first == null) {
        return second;
    }
    return first + second;
}