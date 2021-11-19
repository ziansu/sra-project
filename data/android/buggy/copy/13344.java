private synchronized void returnObject(org.talend.datascience.common.inference.Analyzer<T> analyzer) throws java.lang.RuntimeException {
    try {
        pool.returnObject(java.lang.Thread.currentThread(), analyzer);
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Unable to return analyzer for current thread.", e);
    }
}