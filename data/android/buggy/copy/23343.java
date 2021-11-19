@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.Toast.makeText(context, "Daft to delete no action", Toast.LENGTH_SHORT).show();
    dialogo(sTitles[position], java.lang.Integer.valueOf(sEncId[position]), position, false);
}