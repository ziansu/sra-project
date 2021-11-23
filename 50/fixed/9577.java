@org.junit.Test
public void calculatePenalty_noPenalty() {
    initBasicProperty(dateFormat.format(new java.util.Date()));
    initServicesForPTBillable();
    initDataForCurInstallment();
}