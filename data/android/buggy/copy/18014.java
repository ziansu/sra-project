@java.lang.Override
public void onClick(android.view.View v) {
    screen.delete(0, ((screen.length()) - 1));
    calculatorScreen.setText(screen);
}