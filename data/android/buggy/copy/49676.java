public boolean handleActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if ((billingProcessor) != null) {
        return false;
    }
    return billingProcessor.handleActivityResult(requestCode, resultCode, data);
}