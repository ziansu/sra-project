@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent Carnetintent = new android.content.Intent(this, fr.diabhelp.diabhelp.Core.CoreActivity.class);
    this.startActivity(Carnetintent);
    this.finish();
}