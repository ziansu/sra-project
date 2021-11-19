public void sortDisplayedEvents() {
    java.util.Collections.sort(this.displayedEvents, new main.State.CustomEndTimeComparator());
}