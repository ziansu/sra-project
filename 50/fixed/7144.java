@java.lang.Override
public int getItemCount() {
    return (movies.size()) == 0 ? 0 : (movies.size()) + 1;
}