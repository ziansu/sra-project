@java.lang.Override
public void onActivityCreated(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    this.tableLayout = ((android.widget.TableLayout) (this.getView().findViewById(R.id.budgetTable)));
    setDataOnTable(this.budgetEntities);
}