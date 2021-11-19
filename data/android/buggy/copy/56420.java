@schicwp.hikeplanner.dal.impl.SqlUpdate(value = "update hike set name=:name,start=:start,start_location_id=:startLocationId, end_location_id=:endLocationId where id=:hikeId")
@schicwp.hikeplanner.dal.impl.GetGeneratedKeys
protected abstract long updateHike(@schicwp.hikeplanner.dal.impl.Bind(value = "hikeId")
long id, @schicwp.hikeplanner.dal.impl.BindBean
schicwp.hikeplanner.dal.Hike hike, @schicwp.hikeplanner.dal.impl.Bind(value = "startLocationId")
java.lang.Long startLocationId, @schicwp.hikeplanner.dal.impl.Bind(value = "endLocationId")
java.lang.Long endLocationId);