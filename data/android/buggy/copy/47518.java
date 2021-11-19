@java.lang.Override
public void run() {
    final java.lang.String out = sqlLogger.getAllEntries();
    if (out != null)
        getActivity().runOnUiThread(new org.wahtod.wififixer.ui.LogFragment.ScrollViewUpdater(out));
    
}