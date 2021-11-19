@java.lang.Override
public void onClick(final android.content.DialogInterface dialog, final int which) {
    intent.putExtra("mode", "view");
    intent.putExtra("obj", studentInfoList.get((pos + 1)));
    context.startActivity(intent);
}