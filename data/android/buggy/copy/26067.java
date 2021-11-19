@java.lang.Override
public void onClick(android.view.View v) {
    android.support.v7.app.AlertDialog.Builder number_of_tries_help_dialog_builder = new android.support.v7.app.AlertDialog.Builder(getActivity());
    number_of_tries_help_dialog_builder.setMessage(R.string.circular_floating_action_menu_mit_license).create().show();
}