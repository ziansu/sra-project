@java.lang.Override
public void show() {
    super.show();
    update();
    java.lang.System.out.println(pagedMap.pages[pagedMap.currentPage].levels[1].isLocked);
}