private java.lang.String timeCell(long ms) {
    return ms > 0 ? java.lang.String.format("%,d", ms) : ("> " + (it.unibz.precise.check.ConsistencyCheckerTest.TIMEOUT_MIN)) + " min";
}