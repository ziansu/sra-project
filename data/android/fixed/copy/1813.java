@java.lang.Override
public void onPostExecute(java.lang.String[] result) {
    java.lang.System.out.println(result);
    if (result != null) {
        textView.setText(result[0]);
    }
}