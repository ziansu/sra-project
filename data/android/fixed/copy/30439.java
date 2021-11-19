public void setOptions(java.util.ArrayList<wormy.com.talegram.engine.util.Option> options) {
    optionList.clear();
    this.notifyDataSetChanged();
    this.optionList.addAll(options);
    this.notifyDataSetChanged();
}