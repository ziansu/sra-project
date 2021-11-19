@java.lang.Override
public void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    if ((mode) == (com.bathem.vocabpower.Enum.AddEditMode.add_mode)) {
    }else {
        prepareFieldsForEditMode();
    }
}