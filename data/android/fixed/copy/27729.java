@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    destroyMirror();
    setContentView(com.example.tombarrett.estimotemirror.R.layout.activity_main);
    pickup(product, true);
    tempProduct = product;
}