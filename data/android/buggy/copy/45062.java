public int compareTo(chat.events.ChatEvent o) {
    long t1 = this.getTimeStamp();
    long t2 = o.getTimeStamp();
    return t1 > t2 ? 1 : t1 < t2 ? -1 : 0;
}