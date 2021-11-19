public void onResult(boolean success) {
    if (onRestart) {
        java.lang.System.out.println("onRestartResult");
        adapter.refreshData(buildMap());
        adapter.notifyDataSetChanged();
        onRestart = false;
    }else {
        setupTabs(buildMap());
    }
}