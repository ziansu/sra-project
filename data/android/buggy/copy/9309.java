private void moveToAddFillup() {
    android.content.Intent moveToAddFillup = new android.content.Intent(super.getContext(), com.twild.gastracker.ActivityAddFillup.class);
    moveToAddFillup.putExtra("car_index", currentCarIndex);
    getActivity().finish();
    startActivity(moveToAddFillup);
}