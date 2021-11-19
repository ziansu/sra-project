@com.google.inject.persist.Transactional(rollbackOn = { com.axelor.exception.AxelorException.class , java.lang.Exception.class })
public void finish(com.axelor.apps.production.db.OperationOrder operationOrder) throws com.axelor.exception.AxelorException {
    operationOrderStockMoveService.finish(operationOrder);
    operationOrder.setRealEndDateT(today);
    operationOrder.setStatusSelect(IOperationOrder.STATUS_FINISHED);
    save(operationOrder);
}