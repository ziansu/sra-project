@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(view.getContext(), ualberta.cmput301w16t16.glamorousborrowingwhaleapp.NewListingActivity.class);
    startActivity(intent);
    android.util.Log.d("TEST", "aaa");
}