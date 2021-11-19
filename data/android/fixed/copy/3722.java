@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(getActivity(), cube.table.CubeTableActivity.class);
    startActivity(intent);
}