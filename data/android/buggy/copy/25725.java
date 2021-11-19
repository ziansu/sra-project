@java.lang.Override
public void succeed() {
    mRVAdapter.setList(com.pkhope.diary.MyApplication.getDoc().getDiaryManager().getList());
    mRVAdapter.notifyDataSetChanged();
    android.widget.Toast.makeText(getApplicationContext(), "Load succeed", Toast.LENGTH_SHORT).show();
}