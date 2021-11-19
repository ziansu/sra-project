public void onclickKeep1(android.widget.ImageView view) {
    int num = 1;
    its.farkel.MainFarkel.hand.removeDie(num);
    view.setVisibility(ImageView.INVISIBLE);
    its.farkel.MainFarkel.available[num] = true;
}