@java.lang.Override
public boolean isAvailable() {
    return (getEventsTitleElement().waitUntilAvailable().getText().equals(("Предстоящие события: " + (this.categoryName)))) && (super.isAvailable());
}