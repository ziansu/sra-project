@java.lang.Override
public boolean isChecked() {
    java.lang.System.out.println(backingImage.getAttribute("src"));
    return !(backingImage.getAttribute("src").contains("unchecked"));
}