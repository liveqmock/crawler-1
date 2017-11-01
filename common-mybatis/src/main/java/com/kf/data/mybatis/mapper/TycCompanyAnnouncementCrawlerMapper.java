package com.kf.data.mybatis.mapper;

import com.kf.data.mybatis.entity.TycCompanyAnnouncementCrawler;
import com.kf.data.mybatis.entity.TycCompanyAnnouncementCrawlerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TycCompanyAnnouncementCrawlerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_announcement
     *
     * @mbggenerated Wed Nov 01 11:09:11 CST 2017
     */
    int countByExample(TycCompanyAnnouncementCrawlerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_announcement
     *
     * @mbggenerated Wed Nov 01 11:09:11 CST 2017
     */
    int deleteByExample(TycCompanyAnnouncementCrawlerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_announcement
     *
     * @mbggenerated Wed Nov 01 11:09:11 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_announcement
     *
     * @mbggenerated Wed Nov 01 11:09:11 CST 2017
     */
    int insert(TycCompanyAnnouncementCrawler record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_announcement
     *
     * @mbggenerated Wed Nov 01 11:09:11 CST 2017
     */
    int insertSelective(TycCompanyAnnouncementCrawler record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_announcement
     *
     * @mbggenerated Wed Nov 01 11:09:11 CST 2017
     */
    List<TycCompanyAnnouncementCrawler> selectByExample(TycCompanyAnnouncementCrawlerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_announcement
     *
     * @mbggenerated Wed Nov 01 11:09:11 CST 2017
     */
    TycCompanyAnnouncementCrawler selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_announcement
     *
     * @mbggenerated Wed Nov 01 11:09:11 CST 2017
     */
    int updateByExampleSelective(@Param("record") TycCompanyAnnouncementCrawler record, @Param("example") TycCompanyAnnouncementCrawlerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_announcement
     *
     * @mbggenerated Wed Nov 01 11:09:11 CST 2017
     */
    int updateByExample(@Param("record") TycCompanyAnnouncementCrawler record, @Param("example") TycCompanyAnnouncementCrawlerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_announcement
     *
     * @mbggenerated Wed Nov 01 11:09:11 CST 2017
     */
    int updateByPrimaryKeySelective(TycCompanyAnnouncementCrawler record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_announcement
     *
     * @mbggenerated Wed Nov 01 11:09:11 CST 2017
     */
    int updateByPrimaryKey(TycCompanyAnnouncementCrawler record);
}