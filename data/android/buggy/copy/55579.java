public void onClick(android.view.View v) {
    startActivity(new android.content.Intent(this, com.example.tberroa.girodicerapp.activities.RegisterActivity.class).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION).setAction(Params.RELOAD));
    finish();
}