@java.lang.Override
public void onClick(android.view.View v) {
    list.remove(position);
    notifyDataSetChanged();
    tattoo.tags = list;
    com.tattood.tattood.Server.updateTattoo(context, token, tattoo);
}