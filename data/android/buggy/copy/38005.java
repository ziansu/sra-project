@java.lang.Override
public void onClick(android.view.View view) {
    android.support.design.widget.Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show();
    startActivity(new android.content.Intent(this, io.rasprovers.remotus.activities.NewDownloadActivity.class));
}