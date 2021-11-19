@java.lang.Override
public void onClick(android.view.View v) {
    android.view.View childView = new android.view.View(getActivity());
    childView.setBackgroundColor(colorItems[new java.util.Random().nextInt(colorItems.length)]);
    layout.addView(childView);
}