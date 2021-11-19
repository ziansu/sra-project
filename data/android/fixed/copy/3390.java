@java.lang.Override
public void onClick(android.view.View v) {
    generateRandomTemperatureList(com.codingtest.malabika.tempo.MainActivity.MIN_TEMP, com.codingtest.malabika.tempo.MainActivity.MAX_TEMP);
    populateListView(weekdays_list, null, temperatureValue_List);
    android.widget.Toast.makeText(this, "Temperature Values Refreshed", Toast.LENGTH_SHORT).show();
}