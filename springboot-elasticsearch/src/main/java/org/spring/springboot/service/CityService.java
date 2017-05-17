
package org.spring.springboot.service;

import org.spring.springboot.domain.City;
import org.springframework.data.domain.Page;

public interface CityService {

    /**
     * 新增城市信息
     *
     * @param city
     * @return
     */
    Long saveCity(City city);

    /**
     * 根据关键词，function score query 权重分分页查询
     *
     * @param pageNumber
     * @param pageSize
     * @param searchContent
     * @return
     */
    Page<City> searchCity(Integer pageNumber, Integer pageSize, String searchContent);
}