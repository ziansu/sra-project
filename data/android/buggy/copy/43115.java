public void getEntries() {
    while (reader.hasNextLine()) {
        list.add(reader.nextLine());
    } 
}