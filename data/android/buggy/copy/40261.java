@java.lang.Override
public void onClick(android.view.View view) {
    org.greenrobot.eventbus.EventBus.getDefault().post(new com.shollmann.igcparser.events.FileClickEvent(new java.io.File(igcFile.getFilePath())));
}