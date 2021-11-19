private void showAddContactDialog(java.lang.String qrCodeData) {
    try {
        org.json.JSONObject jsonObject = new org.json.JSONObject(qrCodeData);
        showAddContactDialog(jsonObject);
    } catch (org.json.JSONException e) {
        android.widget.Toast.makeText(mContext, "Error : Malformed QR code data", Toast.LENGTH_LONG).show();
    }
}