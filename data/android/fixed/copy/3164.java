public void dismissItem(int pos) {
    com.vinmein.dvadivel.foodie.model.MenuItems deleteitem = foodmenuitems.get(pos);
    foodmenuitems.remove(pos);
    this.notifyItemRemoved(pos);
    if ((swipeListener) != null)
        swipeListener.onSwipe(deleteitem, pos);
    
}