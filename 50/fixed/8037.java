@java.lang.Override
public void onClick(android.view.View v) {
    if (v == (buttonAddPatient)) {
        android.content.Intent intent = new android.content.Intent(this, com.example.aa.electronicpatientscard.AddPatient.class);
        startActivity(intent);
    }
}