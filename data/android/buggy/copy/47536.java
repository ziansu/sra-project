@java.lang.Override
public void onLoginSuccess(retrofit2.Response<gem.training3.enterprisenetwork.network.dto.ResponseDTO> response) {
    android.content.Intent i = new android.content.Intent(this, gem.training3.enterprisenetwork.screen.main.MainActivity.class);
    startActivity(i);
    finish();
}