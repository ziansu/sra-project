@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    if (dialog.isShowing())
        dialog.dismiss();
    
    mListener.onBeerSuccessfullyAddedToDB();
}