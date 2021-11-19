@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, ca.ualberta.cs.cmput301w15t12.NewAccountActivity.class);
    intent.putExtra("username", name);
    startActivity(intent);
}