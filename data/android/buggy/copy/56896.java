@java.lang.Override
protected void populateView(android.view.View view, com.travelersdiary.models.Travel travel, int position) {
    super.populateView(view, travel, position);
    ((android.widget.TextView) (view.findViewById(android.R.id.text1))).setText(travel.getTitle());
}