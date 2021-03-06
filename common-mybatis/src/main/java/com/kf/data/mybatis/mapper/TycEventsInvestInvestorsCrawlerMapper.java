package com.kf.data.mybatis.mapper;

import com.kf.data.mybatis.entity.TycEventsInvestInvestorsCrawler;
import com.kf.data.mybatis.entity.TycEventsInvestInvestorsCrawlerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TycEventsInvestInvestorsCrawlerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_events_invest_investors
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    int countByExample(TycEventsInvestInvestorsCrawlerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_events_invest_investors
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    int deleteByExample(TycEventsInvestInvestorsCrawlerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_events_invest_investors
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_events_invest_investors
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    int insert(TycEventsInvestInvestorsCrawler record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_events_invest_investors
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    int insertSelective(TycEventsInvestInvestorsCrawler record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_events_invest_investors
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    List<TycEventsInvestInvestorsCrawler> selectByExample(TycEventsInvestInvestorsCrawlerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_events_invest_investors
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    TycEventsInvestInvestorsCrawler selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_events_invest_investors
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    int updateByExampleSelective(@Param("record") TycEventsInvestInvestorsCrawler record, @Param("example") TycEventsInvestInvestorsCrawlerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_events_invest_investors
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    int updateByExample(@Param("record") TycEventsInvestInvestorsCrawler record, @Param("example") TycEventsInvestInvestorsCrawlerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_events_invest_investors
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    int updateByPrimaryKeySelective(TycEventsInvestInvestorsCrawler record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_events_invest_investors
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    int updateByPrimaryKey(TycEventsInvestInvestorsCrawler record);
}