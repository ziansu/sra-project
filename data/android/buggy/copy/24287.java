private void resultReceived() {
    ringProgressDialog.cancel();
    eventBus.post(new io.jawg.osmcontributor.model.events.PleaseLoadPoisToUpdateEvent());
    editTextComment.setText("");
}