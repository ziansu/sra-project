@java.lang.Override
public void onResume() {
    super.onResume();
    if ((task) == null)
        task = new co.ghola.smogalert.MainActivity.LoadCursorTask(this).execute(new java.lang.Integer(co.ghola.smogalert.utils.Constants.LAST_HOUR));
    
}