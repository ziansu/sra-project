@java.lang.Override
public void onDestroyView() {
    recyclerView.setAdapter(null);
    unbinder.unbind();
    super.onDestroyView();
}