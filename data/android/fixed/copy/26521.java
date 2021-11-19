@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    com.example.portable.firebasetests.network.FirebaseUtils.getInstance().deleteTag(tag);
}