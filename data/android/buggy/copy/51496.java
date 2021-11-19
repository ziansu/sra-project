@java.lang.Override
public int getItemCount() {
    return (controllerLinks.sizeLinks()) > 0 ? (controllerLinks.sizeLinks()) + 1 : 0;
}