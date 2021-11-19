@java.lang.Override
public void add(int index, T element) {
    synced.add(index, mapper.apply(element));
    main.add(element);
}