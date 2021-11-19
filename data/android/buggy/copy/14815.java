public void displayMessage() {
    alertDialog = new com.example.anna.colorgame.AlertDialogClass(context, message);
    alertDialog.setPlayer(player);
    alertDialog.setTitleOfAlertDialog("");
    alertDialog.setTextToShowInAlertDialog(text);
    alertDialog.ButtonOK();
}