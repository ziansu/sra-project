@java.lang.Override
public void onClick(android.view.View v) {
    saveComputer();
    onBackPressed();
    android.content.Intent goToItems1 = new android.content.Intent(this, ca.ualberta.cs.technologic.Activities.HomePage.class);
    startActivity(goToItems1);
}