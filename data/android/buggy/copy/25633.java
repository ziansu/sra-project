@java.lang.Override
public void onClick(android.view.View v) {
    input2.setText(vickenkrikorian.calculator.Advanced.solve(input2.getText().toString().substring(((bracket) + 1))));
    actionLocation = -1;
}