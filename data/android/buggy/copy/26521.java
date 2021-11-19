@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    android.util.Log.i("tagD", (("deleting tag with " + (tag.getTasks().size())) + " days"));
    com.example.portable.firebasetests.network.FirebaseUtils.getInstance().deleteTag(tag);
}