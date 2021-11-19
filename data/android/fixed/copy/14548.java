@java.lang.Override
public boolean savePayDetails(com.siddhrans.biometric.model.PaySlip paySlip) {
    persist(paySlip);
    return true;
}