public void onClick(android.content.DialogInterface dialog, int id) {
    dialog.dismiss();
    if (exitOnFinish) {
        getActivity().finish();
    }else {
        getActivity().setRequestedOrientation(prevOrientation);
    }
}