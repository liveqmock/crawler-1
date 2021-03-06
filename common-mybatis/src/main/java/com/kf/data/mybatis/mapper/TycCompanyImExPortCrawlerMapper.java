package com.kf.data.mybatis.mapper;

import com.kf.data.mybatis.entity.TycCompanyImExPortCrawler;
import com.kf.data.mybatis.entity.TycCompanyImExPortCrawlerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TycCompanyImExPortCrawlerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_im_ex_port
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    int countByExample(TycCompanyImExPortCrawlerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_im_ex_port
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    int deleteByExample(TycCompanyImExPortCrawlerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_im_ex_port
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_im_ex_port
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    int insert(TycCompanyImExPortCrawler record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_im_ex_port
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    int insertSelective(TycCompanyImExPortCrawler record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_im_ex_port
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    List<TycCompanyImExPortCrawler> selectByExample(TycCompanyImExPortCrawlerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_im_ex_port
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    TycCompanyImExPortCrawler selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_im_ex_port
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    int updateByExampleSelective(@Param("record") TycCompanyImExPortCrawler record, @Param("example") TycCompanyImExPortCrawlerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_im_ex_port
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    int updateByExample(@Param("record") TycCompanyImExPortCrawler record, @Param("example") TycCompanyImExPortCrawlerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_im_ex_port
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    int updateByPrimaryKeySelective(TycCompanyImExPortCrawler record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_im_ex_port
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    int updateByPrimaryKey(TycCompanyImExPortCrawler record);
}