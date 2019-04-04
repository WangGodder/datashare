package top.godder.userservice.mapper;

import top.godder.common.database.BaseMapper;
import top.godder.userapi.entry.City;

import java.util.List;

public interface CityMapper extends BaseMapper<City> {
    City findCityById(Integer id);

    List<City> findAllCity();

    List<City> findCityByProvinceId(Integer provinceId);

    Integer updateCity(City city);

    boolean addCity(City city);

    Integer deleteCity(Integer id);
}