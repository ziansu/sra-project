public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    startDetailsActivity(listOfTreatments.get(position).get_Id());
}