public void onDeleteMaxim(com.tcolligan.maximmaker.data.Maxim maxim) {
    com.tcolligan.maximmaker.data.MaximManager.getInstance().deleteMaxim(context, maxim);
    maximFeed.showMaxims(maximManager.getMaximList());
}