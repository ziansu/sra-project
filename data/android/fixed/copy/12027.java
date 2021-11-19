@java.lang.Override
public void onCB(id.co.salamander.jancok.network.Status status, java.lang.String nomor) {
    if (status.isSuccess())
        tx_customer_code.setText(nomor);
    else
        id.co.salamander.jancok.Utils.showErrorMessage(context, status.getMessage(), true);
    
}