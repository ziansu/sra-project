private boolean hasOrderOperationComponents(final com.qcadoo.model.api.Entity order) {
    return (order.getField(com.qcadoo.mes.productionScheduling.NormOrderService.ORDER_OPERATION_COMPONENTS)) != null;
}