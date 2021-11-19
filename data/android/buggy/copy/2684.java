public void requestFinalize() {
    if (Validate()) {
        ecs160.deliveries.API.finalize(pID, mUID);
        finalize_button.setEnabled(false);
    }
}