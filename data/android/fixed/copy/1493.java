@java.lang.Override
public void openPedirInfo(itesm.mx.carpoolingtec.model.firebase.User user) {
    android.content.Intent intent = new android.content.Intent(this, itesm.mx.carpoolingtec.userinfo.PedirInfoActivity.class);
    intent.putExtra("id", 1);
    intent.putExtra("user", user);
    startActivity(intent);
}