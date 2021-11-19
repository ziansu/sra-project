@java.lang.Override
public void onResume() {
    super.onResume();
    cursor = studentRepo.getStudentList(false);
    customAdapter = new com.example.martynas.dainynas.CustomAdapter(this, cursor, 0);
    listView.setAdapter(customAdapter);
}