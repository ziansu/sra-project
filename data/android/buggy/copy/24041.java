public void onResume() {
    super.onResume();
    if (app.isResumeAfterActivity()) {
        updateAll();
        app.setResumeAfterActivity(false);
    }
}