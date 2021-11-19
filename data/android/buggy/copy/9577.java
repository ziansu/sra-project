@org.junit.Test
public void calculatePenalty_noPenalty() {
    initBasicProperty(dateFormat.format(new java.util.Date()));
    initServicesForPTBillable();
    initDataForCurInstallment();
    installmentPenaltyAndRebate = billable.getCalculatedPenalty();
    org.junit.Assert.assertTrue(installmentPenaltyAndRebate.isEmpty());
}