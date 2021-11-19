@java.lang.Override
public mt.edu.um.b_d_app.AtomicTransaction next() {
    if ((this.index) < ((this.transactions.size()) - 1)) {
        (index)++;
        return this.transactions.get(index);
    }
    return null;
}