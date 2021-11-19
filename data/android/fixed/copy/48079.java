private java.lang.String getBatchType(int cusIdx) {
    java.lang.String result = input.get(cusIdx).getBatchType();
    uk.gov.dvla.osg.batch.BatchEngine.LOGGER.info("getPreviousBatchType({}) returned '{}'", cusIdx, result);
    return result;
}