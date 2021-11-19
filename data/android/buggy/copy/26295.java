@java.lang.Override
public void onClick(android.view.View v) {
    com.dodola.rocoosample.HelloHack hack = new com.dodola.rocoosample.HelloHack();
    android.widget.Toast.makeText(this, ((hack.showHello()) + " old"), Toast.LENGTH_SHORT).show();
}