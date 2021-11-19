@java.lang.Override
public void onClick(final android.content.DialogInterface dialog, final int which) {
    studentInfoList.remove((pos + 1));
    notifyItemRangeRemoved(pos, 1);
}