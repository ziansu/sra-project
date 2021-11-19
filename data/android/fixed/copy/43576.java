private void saveImageUri(android.net.Uri imageUri) {
    if (imageUri != null)
        preferences.edit().putString("imageUri", imageUri.toString()).apply();
    
}