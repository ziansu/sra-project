public static boolean isTxnActive() {
    if (com.dripstat.api.DripStat.agentActive) {
        java.com.chronon.apm.instrument.InstrumentationCode.api_hasActiveTxn();
    }
    return false;
}