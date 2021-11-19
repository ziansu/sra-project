@java.lang.Override
protected void onPostExecute(java.lang.String s) {
    super.onPostExecute(s);
    if ((getActivity()) != null) {
        android.widget.Toast.makeText(getActivity(), s, Toast.LENGTH_SHORT).show();
    }
}