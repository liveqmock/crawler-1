package com.kf.data.mybatis.mapper;

import com.kf.data.mybatis.entity.TycCompanyCommonstockCrawler;
import com.kf.data.mybatis.entity.TycCompanyCommonstockCrawlerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TycCompanyCommonstockCrawlerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_commonstock
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    int countByExample(TycCompanyCommonstockCrawlerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_commonstock
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    int deleteByExample(TycCompanyCommonstockCrawlerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_commonstock
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_commonstock
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    int insert(TycCompanyCommonstockCrawler record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_commonstock
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    int insertSelective(TycCompanyCommonstockCrawler record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_commonstock
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    List<TycCompanyCommonstockCrawler> selectByExample(TycCompanyCommonstockCrawlerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_commonstock
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    TycCompanyCommonstockCrawler selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_commonstock
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    int updateByExampleSelective(@Param("record") TycCompanyCommonstockCrawler record, @Param("example") TycCompanyCommonstockCrawlerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_commonstock
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    int updateByExample(@Param("record") TycCompanyCommonstockCrawler record, @Param("example") TycCompanyCommonstockCrawlerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_commonstock
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    int updateByPrimaryKeySelective(TycCompanyCommonstockCrawler record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_commonstock
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    int updateByPrimaryKey(TycCompanyCommonstockCrawler record);
}