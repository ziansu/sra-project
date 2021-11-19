public info.robert_fromm.anotli3.text.Message then(java.lang.String text) {
    addCurrentComponent();
    currentComponent = new net.md_5.bungee.api.chat.TextComponent();
    setText(text);
    if (isBook)
        setStyle(info.robert_fromm.anotli3.text.Message.Style.DEFAULT);
    else
        setStyle(info.robert_fromm.anotli3.text.Message.Style.BOOK_DEFAULT);
    
    return this;
}