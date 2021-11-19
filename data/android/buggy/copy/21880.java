protected void add(fry.oldschool.utils.Entry entry) {
    java.lang.System.out.println("----- ConnectionManager#add1");
    this.entry.add(entry);
    sync();
}