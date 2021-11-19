@java.lang.Override
public void onDestroy() {
    stopService(new android.content.Intent(this, edu.umt.csci427.canary.OpenICEService.class));
}