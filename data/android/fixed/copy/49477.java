public void onFinish() {
    counting = false;
    (segmentCount)++;
    toast();
    total.setText(("Total Steps: " + ((int) (currentCount))));
}