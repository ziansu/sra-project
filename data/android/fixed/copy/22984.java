@java.lang.Override
public void onClick(android.view.View v) {
    mTodoIndex = ((mTodoIndex) + 1) % (mTodos.length);
    TodoTextView.setText(mTodos[mTodoIndex]);
}