@java.lang.Override
public java.lang.Void call() throws java.lang.Exception {
    for (java.lang.String conc : concatenatePmid)
        sharedList.insString(intPubMed.Request(conc, 1, "0"));
    
    sharedList.setExit(0);
    return null;
}