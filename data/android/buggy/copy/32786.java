@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(v.getContext(), com.example.nick.countrypedia.view.CountryActivity.class);
    intent.putExtra("id", ((int) (v.getTag())));
    startActivity(intent);
}