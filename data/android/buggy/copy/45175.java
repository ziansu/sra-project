private boolean isTripSet() {
    if (((origAbbr) == null) || ((destAbbr) == null)) {
        android.widget.Toast.makeText(this, "Please select stations in the trip planner.", Toast.LENGTH_SHORT).show();
        return false;
    }
    return true;
}