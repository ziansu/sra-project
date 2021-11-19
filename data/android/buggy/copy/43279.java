@java.lang.Override
public void onClick(android.content.DialogInterface anInterface, int i) {
    if ((loading.getVisibility()) == (android.view.View.VISIBLE))
        return ;
    
    new uiuc.mbr.ui.AddEventDialog.Worker(true).execute();
}