@java.lang.Override
public void onClick(android.view.View v) {
    final int position = (mDataset.indexOf(vocable)) + 1;
    mFragment.showEditWordDialog(position);
}