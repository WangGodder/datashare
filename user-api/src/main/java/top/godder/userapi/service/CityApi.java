package top.godder.userapi.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import top.godder.userapi.entry.City;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * @author: godder
 * @date: 2019/4/1
 */
@FeignClient(value = "service-user", url = "${service.service-user}")
public interface CityApi {
    @RequestMapping(value = Urls.CityApiUrl.GET_CITY, method = GET)
    City findCityById(Integer id);

    @RequestMapping(value = Urls.CityApiUrl.GET_ALL_CITY, method = GET)
    List<City> findAllCity();

    @RequestMapping(value = Urls.CityApiUrl.GET_CITY_BY_PROVINCE, method = GET)
    List<City> findCityByProvince(Integer provinceId);

    @RequestMapping(value = Urls.CityApiUrl.ADD_CITY, method = POST)
    boolean addCity(@RequestBody City city);

    @RequestMapping(value = Urls.CityApiUrl.UPDATE_CITY, method = POST)
    boolean updateCity(@RequestBody City city);

    @RequestMapping(value = Urls.CityApiUrl.DELETE_CITY, method = DELETE)
    boolean deleteCity(@RequestBody Integer id);
}
