private void make_click_command_with_text(edu.wm.translationengine.classes.Component c) {
    java.lang.String espresso_command = new java.lang.String();
    espresso_command += ("\t\t\tonView(withText(\"" + (c.getText())) + "\")).perform(click());\n";
    EspressoTranslator.toWrite.add(espresso_command);
}