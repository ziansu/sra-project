@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    if ((adapter.getCount()) == 0)
        this.progressBar.show();
    
}