public void showImage(int position) {
    java.lang.System.out.println(ownContainer.findViewWithTag(("image" + position)));
    ownContainer.findViewWithTag(("image" + position)).setVisibility(View.VISIBLE);
}