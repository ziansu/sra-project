@butterknife.OnClick(value = R.id.button2)
public void clickedBt(android.view.View view) {
    sp.stop(SOUND_ID);
    finish();
    return ;
}