@org.springframework.web.bind.annotation.RequestMapping(value = "/gpio/off")
public org.springframework.http.ResponseEntity<nl.bos.entities.Pin> gpioOff() {
    gpio.shutdown();
    return new org.springframework.http.ResponseEntity(pin, org.springframework.http.HttpStatus.OK);
}