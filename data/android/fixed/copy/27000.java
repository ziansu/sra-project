@org.springframework.transaction.annotation.Transactional(readOnly = false)
public com.ersoft.web.domain.business.cost.ActualCost additional(com.ersoft.web.domain.business.cost.ActualCost actualCost) {
    actualCost.setAdditional(true);
    return save(actualCost);
}