@java.lang.Override
public java.lang.Long call() throws java.lang.Exception {
    long newValue = getStart();
    setValue(newValue);
    save(db);
    return newValue;
}