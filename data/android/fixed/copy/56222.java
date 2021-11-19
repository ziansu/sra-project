public void renumberDeductions() {
    int i = 0;
    java.util.Collections.sort(maHrsDeductions);
    for (erp.mod.hrs.db.SHrsPayrollReceiptDeduction deduction : maHrsDeductions) {
        deduction.setPkMoveId((++i));
    }
}