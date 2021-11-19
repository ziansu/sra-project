public void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
    objectOutputStream.writeLong(length);
    objectOutputStream.writeInt(data.length);
    objectOutputStream.write(data);
}