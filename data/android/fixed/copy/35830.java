public com.google.firebase.storage.UploadTask saveUserImage(android.net.Uri file, java.lang.String name) {
    com.google.firebase.storage.StorageReference userProfileRef = mImages.child("images").child("users").child(name);
    return userProfileRef.putFile(file);
}