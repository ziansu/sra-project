@java.lang.Override
public void onBindViewHolder(final adapter.EstacaoAdapter.PersonViewHolder personViewHolder, int position) {
    personViewHolder.tvSupervisor.setText(lista.get(position).getDescricao());
}