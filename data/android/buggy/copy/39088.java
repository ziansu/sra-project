@java.lang.Override
public void showCars(com.automotive.hhi.mileagetracker.adapters.CarAdapter cars) {
    android.util.Log.i(LOG_TAG, "In showCars");
    mCarRecyclerView.setAdapter(cars);
    cars.notifyDataSetChanged();
}