@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    Members.set(position, dialogInput.getText().toString());
    listViewCrewAdapter.notifyDataSetChanged();
}