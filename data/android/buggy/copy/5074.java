@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    Members.add(position, dialogInput.getText().toString());
    listViewCrewAdapter.notifyDataSetChanged();
}