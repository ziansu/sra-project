@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent();
    intent.setClass(this, com.inkenka.devdemos.ActivityStack.SecondActivity.class);
    intent.setClass(this, com.inkenka.devdemos.ActivityStack.ThirdActivity.class);
    startActivity(intent);
}