@java.lang.Override
public void setLocation(com.laytonsmith.abstraction.MCLocation loc) {
    location = loc;
    console.sendMessage(("World has been set to " + (location.getWorld().getName())));
}