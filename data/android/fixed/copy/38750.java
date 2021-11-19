@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    omer.parking.com.util.SharedPrefManager.getInstance(this).saveCameWithCar(1);
    startDecLotTask();
}