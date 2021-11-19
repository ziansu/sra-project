@java.lang.Override
public <T extends com.flipkart.portkey.common.entity.Entity> java.util.List<T> getByCriteria(java.lang.Class<T> clazz, java.util.List<java.lang.String> fieldNameList, java.util.Map<java.lang.String, java.lang.Object> criteriaMap) throws com.flipkart.portkey.common.exception.QueryExecutionException {
    return performGetByCriteriaQuery(clazz, fieldNameList, criteriaMap);
}