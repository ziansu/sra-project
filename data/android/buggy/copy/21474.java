public void removeFirstProduct() {
    productList.remove(it.polimi.dima.giftlist.presentation.view.adapter.ProductPickerAdapter.FIRST_POSITION);
    this.notifyDataSetChanged();
}