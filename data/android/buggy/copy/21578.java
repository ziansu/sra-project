@java.lang.Override
public void onMergedCellClick(com.hzn.easytableview.EasyTableView.MergeInfo mergeInfo) {
    if (null != (mergeInfo.texts))
        android.widget.Toast.makeText(this, mergeInfo.texts[0], Toast.LENGTH_SHORT).show();
    
}