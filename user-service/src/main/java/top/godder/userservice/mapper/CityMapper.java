package top.godder.userservice.mapper;

import top.godder.common.database.BaseMapper;
import top.godder.dataapi.entry.City;

import java.util.List;

public interface CityMapper extends BaseMapper<City> {
    City findCityById(Integer id);

    List<City> findAllCity();

    List<City> findCityByProvinceId(Integer provinceId);

    boolean updateCity(City city);

    boolean addCity(City city);

    boolean deleteCity(Integer id);
}