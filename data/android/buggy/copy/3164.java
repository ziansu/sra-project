public void dismissItem(int pos) {
    foodmenuitems.remove(pos);
    this.notifyItemRemoved(pos);
    com.vinmein.dvadivel.foodie.model.MenuItems deleteitem = foodmenuitems.get(pos);
    if ((swipeListener) != null)
        swipeListener.onSwipe(deleteitem, pos);
    
}