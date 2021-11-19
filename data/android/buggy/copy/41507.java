public void onClick(android.view.View v) {
    android.content.Intent theintent = new android.content.Intent(this, com.groupc.officelocator.masterSearchWithHeaders.class);
    theintent.putExtras(dataContainer);
    this.finish();
    startActivity(theintent);
}