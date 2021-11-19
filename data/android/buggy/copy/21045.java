@java.lang.Override
public void onClick(android.view.View v) {
    startActivity(new android.content.Intent(this, com.expenx.expenx.activity.ExpenxActivity.class));
    LoginActivity.isExpenxActivityLaunched = true;
    this.finish();
}