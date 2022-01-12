private android.view.View createView(android.view.ViewGroup parent) {
    android.view.LayoutInflater layoutInflater = ((android.view.LayoutInflater) (getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE)));
    return layoutInflater.inflate(layout, parent, false);
}