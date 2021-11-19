@java.lang.Override
protected void onPostExecute(com.example.shaafi.mydoctor.utilities.ImageHandler.PatientNView mPatientNView) {
    progressBar.setVisibility(View.GONE);
    if ((mPatientNView != null) && ((mPatientNView.bitmap) != null)) {
        mPatientNView.mImageView.setImageBitmap(mPatientNView.bitmap);
        com.example.shaafi.mydoctor.utilities.ImageHandler.imageCache.put(mPatientNView.mName, mPatientNView.bitmap);
    }
}