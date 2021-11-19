@java.lang.Override
public project.Glyph currentItem() {
    if ((this.index) < (this.list.count())) {
        return this.list.getAt(this.index);
    }else {
        return null;
    }
}