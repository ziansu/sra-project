@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if (validate()) {
        submitEvent();
        getFragmentManager().popBackStack();
    }
}