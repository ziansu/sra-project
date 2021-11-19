@java.lang.Override
public void run() {
    if (((numTabs) == 2) && (index == 0)) {
        tabs.setSelectedIndex(0);
    }else {
        tabs.setSelectedIndex((index - 1));
    }
}