@java.lang.Override
@org.springframework.cache.annotation.CacheEvict(value = "Hotel", allEntries = true)
public com.twinsoft.domain.Hotel save(com.twinsoft.domain.Hotel hotel) {
    return repository.save(hotel);
}