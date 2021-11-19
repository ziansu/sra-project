@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    android.widget.Toast.makeText(context, "CREATED SQLITE FROM PHP", Toast.LENGTH_SHORT).show();
    pd.dismiss();
}