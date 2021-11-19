@butterknife.OnClick(value = R.id.enterConnect3)
public void setmEnterConnect3() {
    android.widget.Toast.makeText(getActivity(), "The button works", Toast.LENGTH_SHORT).show();
    startActivity(new android.content.Intent(getActivity(), com.example.kevin_sct.beastchat.activities.GameActivity.class));
}