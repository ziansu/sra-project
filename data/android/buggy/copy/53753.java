@java.lang.Override
public void onFailure(java.lang.Throwable reason) {
    slottedController.handleGoToException(new com.googlecode.slotted.client.CodeSplitLoadException("Code Splitting load failed", reason));
}