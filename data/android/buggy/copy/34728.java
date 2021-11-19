@java.lang.Override
public int getCount() {
    int count = ((matchTableRows.size()) + (matches.size())) + (sections);
    java.lang.System.out.println(("Antall celler som skal fylles ut " + count));
    return count;
}