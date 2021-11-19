@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    java.lang.String grabbedString = input.getText().toString();
    listItems.set(pos, new com.example.ud4.todo_list.ListItem(grabbedString));
    adapter.notifyDataSetChanged();
}