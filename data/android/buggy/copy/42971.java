@java.lang.Override
public void refreshDocList(int position, int action) {
    docList.getAdapter().notifyDataSetChanged();
}