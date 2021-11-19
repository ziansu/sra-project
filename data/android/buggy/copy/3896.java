@java.lang.Override
public void onClick(android.view.View v) {
    new android.app.AlertDialog.Builder(getParent()).setTitle("Changelog").setMessage(DeprecationHelper.Html.fromHtml(fullUpdateMessage)).setPositiveButton(R.string.dialog_action_positive_close, null).show();
}