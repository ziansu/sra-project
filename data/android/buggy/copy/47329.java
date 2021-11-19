@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, com.delisauce.teamchallenge.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    com.delisauce.teamchallenge.MainApplication.getCallbackManager().onActivityResult(requestCode, resultCode, data);
}