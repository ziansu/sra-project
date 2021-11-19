public void addError(junit.framework.Test test, java.lang.Throwable e) {
    currentTest.setStatus('E');
    java.lang.String exception = e.toString();
    currentTest.setException(exception);
}