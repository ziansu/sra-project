@java.lang.Override
public void onClick(android.view.View v) {
    dialog.dismiss();
    android.content.Intent intent = new android.content.Intent();
    intent.setClass(this, com.xsdlr.rnjmessage.im.activity.DemoActivity.class);
    startActivity(intent);
    this.finish();
}