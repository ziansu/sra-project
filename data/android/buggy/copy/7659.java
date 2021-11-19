@java.lang.Override
public void onClick(android.view.View v) {
    if (!(POIpath.getText().toString().equals("")))
        checkPathField();
    else
        addNewPOI();
    
}