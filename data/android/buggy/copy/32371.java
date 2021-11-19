@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(context, nyc.c4q.syd.updateme.JobActivity.class);
    intent.putExtra("jobs", ((java.io.Serializable) (jobs)));
    context.startActivity(intent);
}