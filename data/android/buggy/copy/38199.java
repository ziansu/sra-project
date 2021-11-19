@java.lang.Override
public boolean removeAdvanceById(int advanceId, int payrollId, java.lang.Double removedAmount, java.lang.Double amountToBeReceive, java.lang.Double amountReceivable, java.lang.String remarks) {
    return payrollDAO.removeAdvancesById(advanceId, payrollId, removedAmount, amountToBeReceive, amountReceivable, remarks);
}