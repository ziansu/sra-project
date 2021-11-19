@java.lang.Override
public void onViewCreated(@android.support.annotation.Nullable
android.view.View view, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    this.bankTransactionSupplier.addDataListeningObject(this);
    this.bankTransactionSupplier.onResume();
    updateCalendar();
}