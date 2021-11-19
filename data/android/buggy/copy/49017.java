public void onClick(android.view.View v) {
    if (buttonName.equals("Restart")) {
        dialog.dismiss();
        activity.finish();
    }else {
        dialog.dismiss();
    }
}