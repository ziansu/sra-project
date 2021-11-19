@java.lang.Override
public void onClick(android.view.View view) {
    getFragmentManager().beginTransaction().replace(R.id.container, new com.shawn.br.fragment.BookFragment()).commit();
}