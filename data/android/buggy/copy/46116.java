@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.content_create_group);
    context = this;
    initElementsWithIds();
    initElementsWithListeners();
    mStorageRef = com.google.firebase.storage.FirebaseStorage.getInstance().getReference();
}