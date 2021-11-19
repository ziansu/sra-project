@java.lang.Override
public void onClick(android.view.View v) {
    ((android.widget.TextView) (view.findViewById(R.id.textToChange))).setText(("New text. And now, here's a number: " + (new java.util.Random().nextInt(100))));
}