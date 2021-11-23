@java.lang.Override
public boolean isPass() {
    if ((averageScore()) > 50) {
        pass = true;
    }
    return pass;
}