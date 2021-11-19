public void init(android.content.Context ctx) {
    android.view.LayoutInflater inflater = ((android.view.LayoutInflater) (ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE)));
    android.view.View view = inflater.inflate(R.layout.view_my_layout, null);
    addView(view);
}