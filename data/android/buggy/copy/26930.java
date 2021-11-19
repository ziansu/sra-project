public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.String text = msgGen.generateText();
    result.setText(text);
    java.lang.System.out.println("Generating...");
    java.lang.System.out.println(text);
}