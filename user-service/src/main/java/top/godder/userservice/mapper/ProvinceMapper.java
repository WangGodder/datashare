package top.godder.userservice.mapper;

import top.godder.common.database.BaseMapper;
import top.godder.userapi.entry.Province;

import java.util.List;

public interface ProvinceMapper extends BaseMapper<Province> {
    Province findProvinceById(Integer id);

    List<Province> findAllProvince();

    boolean addProvince(Province province);

    boolean updateProvince(Province province);

    boolean deleteProvince(Integer id);
}