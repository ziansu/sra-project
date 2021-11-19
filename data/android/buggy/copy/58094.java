@java.lang.Override
public void notifyDataSetChanged() {
    for (java.util.Observer observer : observers) {
        observer.update(null, null);
    }
}