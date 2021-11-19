public void keyDuplicatesTable(java.lang.String key, java.util.concurrent.atomic.AtomicInteger line) {
    sb.append("Table already exists for key defined on line ").append(line.get()).append(": ").append(key).append('\n');
}