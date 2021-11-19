@java.lang.Override
public void handleMessage(android.os.Message msg) {
    switch (msg.what) {
        case com.apps.gabothekiller.debaterbluetooth.MainActivity.SUCCESS_CONNECT :
            android.widget.Toast.makeText(this, "CONNECT", Toast.LENGTH_SHORT).show();
            break;
    }
}