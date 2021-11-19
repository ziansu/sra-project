public void setOptions(java.util.ArrayList<wormy.com.talegram.engine.util.Option> options) {
    optionList.clear();
    this.optionList.addAll(options);
    this.notifyDataSetChanged();
}