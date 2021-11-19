@java.lang.Override
public void onSuccess(java.lang.Void result) {
    java.util.List<org.eyeseetea.malariacare.data.database.model.Value> values = mConverter.getValues();
    saveConvertedValues(callback, values);
}