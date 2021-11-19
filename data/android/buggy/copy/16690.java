public void setOption(com.revolware.poll.option.TextOption textOption) {
    option = textOption;
    optionContainer.removeAllViews();
    optionContainer.addView(option);
}