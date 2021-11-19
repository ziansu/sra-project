@java.lang.Override
public boolean savePayDetails(com.siddhrans.biometric.model.PaySlip paySlip) {
    com.siddhrans.biometric.model.PaySlip existingPaySlip = getPayDetails(paySlip.getUserId(), paySlip.getYear(), paySlip.getMonth());
    if (existingPaySlip == null)
        persist(paySlip);
    
    return true;
}