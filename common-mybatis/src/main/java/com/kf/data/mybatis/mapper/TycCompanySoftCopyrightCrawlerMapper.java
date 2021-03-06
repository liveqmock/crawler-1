package com.kf.data.mybatis.mapper;

import com.kf.data.mybatis.entity.TycCompanySoftCopyrightCrawler;
import com.kf.data.mybatis.entity.TycCompanySoftCopyrightCrawlerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TycCompanySoftCopyrightCrawlerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_soft_copyright
     *
     * @mbggenerated Tue Oct 31 16:49:07 CST 2017
     */
    int countByExample(TycCompanySoftCopyrightCrawlerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_soft_copyright
     *
     * @mbggenerated Tue Oct 31 16:49:07 CST 2017
     */
    int deleteByExample(TycCompanySoftCopyrightCrawlerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_soft_copyright
     *
     * @mbggenerated Tue Oct 31 16:49:07 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_soft_copyright
     *
     * @mbggenerated Tue Oct 31 16:49:07 CST 2017
     */
    int insert(TycCompanySoftCopyrightCrawler record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_soft_copyright
     *
     * @mbggenerated Tue Oct 31 16:49:07 CST 2017
     */
    int insertSelective(TycCompanySoftCopyrightCrawler record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_soft_copyright
     *
     * @mbggenerated Tue Oct 31 16:49:07 CST 2017
     */
    List<TycCompanySoftCopyrightCrawler> selectByExample(TycCompanySoftCopyrightCrawlerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_soft_copyright
     *
     * @mbggenerated Tue Oct 31 16:49:07 CST 2017
     */
    TycCompanySoftCopyrightCrawler selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_soft_copyright
     *
     * @mbggenerated Tue Oct 31 16:49:07 CST 2017
     */
    int updateByExampleSelective(@Param("record") TycCompanySoftCopyrightCrawler record, @Param("example") TycCompanySoftCopyrightCrawlerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_soft_copyright
     *
     * @mbggenerated Tue Oct 31 16:49:07 CST 2017
     */
    int updateByExample(@Param("record") TycCompanySoftCopyrightCrawler record, @Param("example") TycCompanySoftCopyrightCrawlerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_soft_copyright
     *
     * @mbggenerated Tue Oct 31 16:49:07 CST 2017
     */
    int updateByPrimaryKeySelective(TycCompanySoftCopyrightCrawler record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_soft_copyright
     *
     * @mbggenerated Tue Oct 31 16:49:07 CST 2017
     */
    int updateByPrimaryKey(TycCompanySoftCopyrightCrawler record);
}