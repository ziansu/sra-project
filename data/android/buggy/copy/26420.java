@java.lang.Override
public void onItemClick(int position) {
    listener.showTranslateFragment(list.get(position));
}