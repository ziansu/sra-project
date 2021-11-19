public void onclickKeep6(android.widget.ImageView view) {
    int num = 6;
    its.farkel.MainFarkel.hand.removeDie(num);
    view.setVisibility(ImageView.INVISIBLE);
    its.farkel.MainFarkel.available[num] = true;
}