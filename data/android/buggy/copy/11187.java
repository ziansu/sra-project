@java.lang.Override
public int compareTo(Model.Player another) {
    if ((this.points) < (another.points)) {
        return -1;
    }else {
        return 1;
    }
}