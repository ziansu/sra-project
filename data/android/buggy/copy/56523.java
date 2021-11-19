public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<java.lang.Void> task) {
    startActivity(new android.content.Intent(this, com.example.adityadesai.cng.Activities.ChooseActivity.class));
    finish();
}