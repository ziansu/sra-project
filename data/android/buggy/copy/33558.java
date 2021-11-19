@java.lang.Override
public void onDiskMoved(com.po.sample.hanoi.DiskView disk) {
    android.os.Message message = mainUIHandler.obtainMessage(com.po.sample.hanoi.MainActivity.MSG_POP_DISK_MOVEMENT);
    mainUIHandler.sendMessage(message);
}