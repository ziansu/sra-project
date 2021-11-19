@java.lang.Override
public void run() {
    while (key.value.contains("q")) {
        key.value = scan.next();
    } 
    end = true;
}