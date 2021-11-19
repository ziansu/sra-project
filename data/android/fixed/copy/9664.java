@org.springframework.web.bind.annotation.RequestMapping(value = "devices")
public java.util.Collection<com.programyourhome.ir.model.PyhDevice> getDevices() {
    return this.infraRed.getDevices();
}