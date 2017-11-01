package com.kf.data.mybatis.mapper;

import com.kf.data.mybatis.entity.TycCompanyBoundCrawler;
import com.kf.data.mybatis.entity.TycCompanyBoundCrawlerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TycCompanyBoundCrawlerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_bond
     *
     * @mbggenerated Wed Nov 01 17:03:59 CST 2017
     */
    int countByExample(TycCompanyBoundCrawlerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_bond
     *
     * @mbggenerated Wed Nov 01 17:03:59 CST 2017
     */
    int deleteByExample(TycCompanyBoundCrawlerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_bond
     *
     * @mbggenerated Wed Nov 01 17:03:59 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_bond
     *
     * @mbggenerated Wed Nov 01 17:03:59 CST 2017
     */
    int insert(TycCompanyBoundCrawler record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_bond
     *
     * @mbggenerated Wed Nov 01 17:03:59 CST 2017
     */
    int insertSelective(TycCompanyBoundCrawler record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_bond
     *
     * @mbggenerated Wed Nov 01 17:03:59 CST 2017
     */
    List<TycCompanyBoundCrawler> selectByExample(TycCompanyBoundCrawlerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_bond
     *
     * @mbggenerated Wed Nov 01 17:03:59 CST 2017
     */
    TycCompanyBoundCrawler selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_bond
     *
     * @mbggenerated Wed Nov 01 17:03:59 CST 2017
     */
    int updateByExampleSelective(@Param("record") TycCompanyBoundCrawler record, @Param("example") TycCompanyBoundCrawlerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_bond
     *
     * @mbggenerated Wed Nov 01 17:03:59 CST 2017
     */
    int updateByExample(@Param("record") TycCompanyBoundCrawler record, @Param("example") TycCompanyBoundCrawlerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_bond
     *
     * @mbggenerated Wed Nov 01 17:03:59 CST 2017
     */
    int updateByPrimaryKeySelective(TycCompanyBoundCrawler record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_bond
     *
     * @mbggenerated Wed Nov 01 17:03:59 CST 2017
     */
    int updateByPrimaryKey(TycCompanyBoundCrawler record);
}