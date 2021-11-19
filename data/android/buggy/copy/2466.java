private void setFabNextAction() {
    fabAction = BottomSheetConfig.FabAction.NEXT;
    fab.setImageResource(R.drawable.ic_arrow_forward_48dp);
    fab.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            displayNextExhibitPage();
        }
    });
}