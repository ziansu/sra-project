@java.lang.Override
public void succeed() {
    mRVAdapter.setList(com.pkhope.diary.MyApplication.getDoc().getDiaryManager().getList());
    mRVAdapter.notifyDataSetChanged();
}