public int forDemoTextPut() {
    text = textList[((count)++)];
    talking.talk(text);
    if ((count) == (listSize)) {
        count = -1;
    }
    return count;
}