public hr.fer.zemris.nenr.fuzzy.DomainElement elementForIndex(int index) {
    int i = 0;
    for (hr.fer.zemris.nenr.fuzzy.DomainElement element : this) {
        if (i == index) {
            return element;
        }
        i++;
    }
    throw new java.lang.IndexOutOfBoundsException();
}