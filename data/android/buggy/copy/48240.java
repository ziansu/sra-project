@java.lang.Override
protected void onCreate(android.os.Bundle savedInstance) {
    super.onCreate(savedInstance);
    com.duck.owlcctv.databinding.ActivityAuthLoginBinding binding = android.databinding.DataBindingUtil.setContentView(this, R.layout.activity_auth_login);
    binding.setViewModel(viewModel);
    android.util.Log.d(com.duck.owlcctv.activity.AuthLoginActivity.TAG, "onCreate finished");
}