@org.springframework.web.bind.annotation.GetMapping(value = "/city/{location}/specialty/{specialty}")
public java.util.List<com.example.nzoz.demonzoz.dto.DoctorSlotDto> getAdverts(@org.springframework.web.bind.annotation.PathVariable
final java.lang.String location, @org.springframework.web.bind.annotation.PathVariable
final java.lang.String specialty) {
    return advertService.getAdvertsTest(location, specialty);
}