@java.lang.Override
protected void onReceiveResult(int resultCode, android.os.Bundle resultData) {
    if (resultCode == 100) {
        runOnUiThread(new test.maps.app.MapsActivity.UpdateUI(resultData.getDouble("latitude"), resultData.getDouble("longitude")));
    }else {
    }
}