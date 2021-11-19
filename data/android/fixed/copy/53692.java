private void onSwipeRight() {
    if ((!(isGoingRight)) && (!(isGoingLeft))) {
        isGoingRight = true;
        isGoingLeft = false;
        isGoingDown = false;
        isGoingUp = false;
    }
}