public org.kuali.ole.dsng.rest.processor.OleDsNgRestAPIProcessor getOleDsNgRestAPIProcessor() {
    if (null == (oleDsNgRestAPIProcessor)) {
        oleDsNgRestAPIProcessor = new org.kuali.ole.dsng.rest.processor.OleDsNgRestAPIProcessor();
    }
    return oleDsNgRestAPIProcessor;
}