@java.lang.Override
public void onClick(android.view.View v) {
    com.example.david_2.petshop.Intent intent = new com.example.david_2.petshop.Intent(this, com.example.david_2.petshop.Record.class);
    startActivity(intent);
    adapter.notifyDataSetChanged();
}