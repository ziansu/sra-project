@java.lang.Override
public void onSuccess(com.owsega.hellotractorsample.model.FarmerEntity[] results) {
    android.util.Log.e("seyi", ("farmer fetch successful " + (results.length)));
    com.owsega.hellotractorsample.model.Farmer.saveFarmers(results);
}