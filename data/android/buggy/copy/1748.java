@java.lang.Override
public void run() {
    displayMessages(responseString);
    rv.getAdapter().notifyItemInserted(messages.size());
    rv.getAdapter().notifyDataSetChanged();
}