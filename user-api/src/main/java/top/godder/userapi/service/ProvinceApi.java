package top.godder.userapi.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import top.godder.userapi.entry.Province;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * @author: godder
 * @date: 2019/4/1
 */
@FeignClient(value = "service-user", url = "${service.service-user}")
public interface ProvinceApi {
    @RequestMapping(value = Urls.ProvinceApiUrl.GET_PROVINCE, method = GET)
    Province findProvinceById(@RequestBody Integer id);

    @RequestMapping(value = Urls.ProvinceApiUrl.GET_ALL_PROVINCE, method = GET)
    List<Province> findAllProvince();

    @RequestMapping(value = Urls.ProvinceApiUrl.ADD_PROVINCE, method = POST)
    boolean addProvince(@RequestBody Province province);

    @RequestMapping(value = Urls.ProvinceApiUrl.UPDATE_PROVINCE, method = POST)
    boolean updateProvince(@RequestBody Province province);

    @RequestMapping(value = Urls.ProvinceApiUrl.DELETE_PROVINCE, method = DELETE)
    boolean deleteProvince(@RequestBody Integer id);
}
