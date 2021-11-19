@java.lang.Override
public void setConstrainingQueryDefinition(java.lang.Object constrainingQueryDefinition) {
    logger.debug("setting constraining query: {}", constrainingQueryDefinition.toString());
    getMarkLogicClient().setConstrainingQueryDefinition(constrainingQueryDefinition);
}