@java.lang.Override
public void handleEvent(org.eclipse.swt.widgets.Event e) {
    java.lang.String text = searchField.getText();
    if ((text != null) && (text.equals("поиск...")))
        searchField.setText("");
    
}