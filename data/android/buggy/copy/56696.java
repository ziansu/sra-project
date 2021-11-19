@java.lang.Override
public void response(long code) throws android.os.RemoteException {
    android.widget.Toast.makeText(this, "error callback id invoked", Toast.LENGTH_SHORT).show();
    android.util.Log.i(cn.ac.iie.rpclient.MainActivity.TAG, "error callback is invoked");
}