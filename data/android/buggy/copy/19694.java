@java.lang.Override
public void onVolumeChanged(int volume, byte[] data) {
    showTip(("当前正在说话，音量大小：" + volume));
}