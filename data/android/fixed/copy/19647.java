@java.lang.Override
public void valueChange(com.vaadin.data.Property.ValueChangeEvent event) {
    dataElementsChange(((nl.amc.biolab.nsg.dataobjects.NsgDataElement) (itemList.getValue())).getDataElement(), false);
}