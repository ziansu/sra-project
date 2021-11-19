@java.lang.Override
public void onBackPressed() {
    java.lang.String circStr = parser.elementsToTxt(com.cpen321.circuitsolver.ui.draw.DrawActivity.circuitElms, screenHeight, screenWidth);
    circuitProject.saveCircuitDefinitionFile(circStr);
    android.content.Intent backToHomeIntent = new android.content.Intent(this, com.cpen321.circuitsolver.ui.HomeActivity.class);
    startActivity(backToHomeIntent);
    finish();
}