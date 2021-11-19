@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent i = new android.content.Intent(this, com.cg.historicalfiguresquiz.CategoriesActivity.class);
    this.finish();
    startActivity(i);
}