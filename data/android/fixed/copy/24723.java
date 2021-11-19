@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(view.getContext(), com.example.justine.taragala.SignIn.class);
    startActivityForResult(intent, 0);
}