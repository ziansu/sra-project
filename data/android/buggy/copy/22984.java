@java.lang.Override
public void onClick(android.view.View v) {
    mTodoIndex += 1;
    TodoTextView.setText(mTodos[mTodoIndex]);
}