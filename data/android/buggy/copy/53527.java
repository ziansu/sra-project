@java.lang.Override
public int getItemViewType(int position) {
    return position >= (list_card.size()) ? appteam.nith.hillffair.adapters.CardAdapter.FOOTER_VIEW : appteam.nith.hillffair.adapters.CardAdapter.NORMAL_VIEW;
}