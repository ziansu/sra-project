public void onRestoreInstanceState(android.os.Bundle outState) {
    if (outState.containsKey("image_pick_request_code")) {
        mRequestCode = outState.getInt("image_pick_request_code");
    }
}