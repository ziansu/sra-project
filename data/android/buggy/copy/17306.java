public void putOrderList(in.curience.hacktrec.Models.OrderedData data) {
    java.lang.String updated = gson.toJson(getOrdersList().add(data));
    editor.putString(ORDERS_LIST, updated).commit();
}