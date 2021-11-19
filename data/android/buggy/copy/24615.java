@java.lang.Override
public void access(Page p, int idx, java.util.ArrayList<Page> mem) {
    Page access_page = mem.get(idx);
    access_page.r = 1;
    access_page.dirty = p.dirty;
}