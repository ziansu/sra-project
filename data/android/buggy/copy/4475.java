@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.fragment_configuration);
    auth = com.google.firebase.auth.FirebaseAuth.getInstance();
    database = com.google.firebase.database.FirebaseDatabase.getInstance();
    butterknife.ButterKnife.bind(this);
}