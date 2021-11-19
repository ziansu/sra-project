@java.lang.Override
public void onClick(android.view.View v) {
    buttonSound.start();
    android.content.Intent i = new android.content.Intent(this, com.nedswebsite.ktog.Rules.class);
    this.startActivity(i);
}