@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), superheroesintechnology.gl3am.Activities.LoadSMSActivity.class);
    startActivityForResult(intent, 2);
}