package top.godder.dataapi.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import top.godder.dataapi.entry.Province;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * @author: godder
 * @date: 2019/4/1
 */
@FeignClient(value = "user-service", url = "${service.user-service}")
public interface ProvinceApi {
    @RequestMapping(value = UserUrls.ProvinceApiUrl.GET_PROVINCE, method = GET)
    Province findProvinceById(@RequestBody Integer id);

    @RequestMapping(value = UserUrls.ProvinceApiUrl.GET_ALL_PROVINCE, method = GET)
    List<Province> findAllProvince();

    @RequestMapping(value = UserUrls.ProvinceApiUrl.ADD_PROVINCE, method = POST)
    boolean addProvince(@RequestBody Province province);

    @RequestMapping(value = UserUrls.ProvinceApiUrl.UPDATE_PROVINCE, method = POST)
    boolean updateProvince(@RequestBody Province province);

    @RequestMapping(value = UserUrls.ProvinceApiUrl.DELETE_PROVINCE, method = DELETE)
    boolean deleteProvince(@RequestBody Integer id);
}
