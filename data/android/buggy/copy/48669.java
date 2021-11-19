@java.lang.Override
public void onFailure(java.lang.Exception error) {
    scheduleCleanup(addRecipientResponse.getRecipientId());
    fail(error.getMessage());
}