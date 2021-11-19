public void setOrder(android.view.MenuItem order) {
    if ((setItemOrder()) == (com.example.personale.noteexam.controller.utilities.Field.ORDER_DESC)) {
        order.setIcon(R.drawable.ic_desc);
    }else {
        order.setIcon(R.drawable.ic_asc);
    }
}