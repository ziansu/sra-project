@java.lang.Override
public void onItemClick(android.view.View view, int postion) {
    android.widget.Toast.makeText(getActivity(), ("click --" + postion), Toast.LENGTH_SHORT).show();
}