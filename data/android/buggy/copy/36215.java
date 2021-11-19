@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    java.lang.System.out.println(result);
    if (dialog.isShowing())
        dialog.dismiss();
    
    mListener.onBeerSuccessfullyAddedToDB();
}