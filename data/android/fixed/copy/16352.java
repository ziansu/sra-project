@java.lang.Override
public int compareTo(MutableInteger obj) {
    if ((this.value) == (obj.value())) {
        return 0;
    }
    return (this.value) > (obj.value()) ? 1 : -1;
}