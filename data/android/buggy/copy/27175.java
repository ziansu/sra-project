@java.lang.Override
public void setPropertyDataSource(com.vaadin.data.Property newDataSource) {
    super.setPropertyDataSource(newDataSource);
    if (newDataSource == null)
        setValue(null);
    
    setValue(newDataSource.getValue());
}