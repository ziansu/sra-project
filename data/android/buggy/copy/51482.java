public void irSiguiente(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, com.cebancpizza.cliente.DatosCliente.class);
    intent.putExtra("normal", true);
    startActivity(intent);
}