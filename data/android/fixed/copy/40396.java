@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.example.jxw679.mogul.activities.AddTaskActivity.class);
    intent.putExtra(com.example.jxw679.mogul.activities.ParentViewActivity.PARENT_OBJECT_EXTRA_TAG, currentUser);
    intent.putExtra(com.example.jxw679.mogul.activities.ParentViewActivity.CHILD_LIST_OBJECT_EXTRA_TAG, mChildObjects);
    startActivityForResult(intent, 123);
}