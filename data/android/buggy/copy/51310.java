@java.lang.Override
public int hashCode() {
    return (this.getLatLng().hashCode()) ^ (this.getAddress().hashCode());
}