public void onDeleteMaxim(com.tcolligan.maximmaker.data.Maxim maxim) {
    com.tcolligan.maximmaker.data.MaximManager.getInstance().deleteMaxim(context, maxim);
    showMaxims(maximManager.getMaximList());
}