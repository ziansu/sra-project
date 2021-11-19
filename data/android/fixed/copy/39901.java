@java.lang.Override
public void write(int address, int value) {
    (mNumOpcodeCycles)++;
    memory.write(address, value);
}