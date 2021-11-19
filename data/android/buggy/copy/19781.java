@java.lang.Override
public int getItemViewType(int position) {
    if ((position != 0) && ((position % 4) == 0)) {
        return com.meghanil.ganpatiaarto.adapter.AartiListAdapter.ad;
    }else {
        return com.meghanil.ganpatiaarto.adapter.AartiListAdapter.main;
    }
}