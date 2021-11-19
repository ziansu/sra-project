@java.lang.Override
protected void onPostExecute(java.lang.Boolean aBoolean) {
    super.onPostExecute(aBoolean);
    com.ybg.rp.vm.utils.ProgressDialogUtil.closeDialog();
    adapter.notifyDataSetChanged();
}