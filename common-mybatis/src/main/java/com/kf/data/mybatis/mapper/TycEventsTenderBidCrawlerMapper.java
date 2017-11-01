package com.kf.data.mybatis.mapper;

import com.kf.data.mybatis.entity.TycEventsTenderBidCrawler;
import com.kf.data.mybatis.entity.TycEventsTenderBidCrawlerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TycEventsTenderBidCrawlerMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tyc_events_tender_bid
	 * @mbggenerated  Wed Nov 01 15:18:49 CST 2017
	 */
	int countByExample(TycEventsTenderBidCrawlerExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tyc_events_tender_bid
	 * @mbggenerated  Wed Nov 01 15:18:49 CST 2017
	 */
	int deleteByExample(TycEventsTenderBidCrawlerExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tyc_events_tender_bid
	 * @mbggenerated  Wed Nov 01 15:18:49 CST 2017
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tyc_events_tender_bid
	 * @mbggenerated  Wed Nov 01 15:18:49 CST 2017
	 */
	int insert(TycEventsTenderBidCrawler record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tyc_events_tender_bid
	 * @mbggenerated  Wed Nov 01 15:18:49 CST 2017
	 */
	int insertSelective(TycEventsTenderBidCrawler record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tyc_events_tender_bid
	 * @mbggenerated  Wed Nov 01 15:18:49 CST 2017
	 */
	List<TycEventsTenderBidCrawler> selectByExampleWithBLOBs(TycEventsTenderBidCrawlerExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tyc_events_tender_bid
	 * @mbggenerated  Wed Nov 01 15:18:49 CST 2017
	 */
	List<TycEventsTenderBidCrawler> selectByExample(TycEventsTenderBidCrawlerExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tyc_events_tender_bid
	 * @mbggenerated  Wed Nov 01 15:18:49 CST 2017
	 */
	TycEventsTenderBidCrawler selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tyc_events_tender_bid
	 * @mbggenerated  Wed Nov 01 15:18:49 CST 2017
	 */
	int updateByExampleSelective(@Param("record") TycEventsTenderBidCrawler record,
			@Param("example") TycEventsTenderBidCrawlerExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tyc_events_tender_bid
	 * @mbggenerated  Wed Nov 01 15:18:49 CST 2017
	 */
	int updateByExampleWithBLOBs(@Param("record") TycEventsTenderBidCrawler record,
			@Param("example") TycEventsTenderBidCrawlerExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tyc_events_tender_bid
	 * @mbggenerated  Wed Nov 01 15:18:49 CST 2017
	 */
	int updateByExample(@Param("record") TycEventsTenderBidCrawler record,
			@Param("example") TycEventsTenderBidCrawlerExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tyc_events_tender_bid
	 * @mbggenerated  Wed Nov 01 15:18:49 CST 2017
	 */
	int updateByPrimaryKeySelective(TycEventsTenderBidCrawler record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tyc_events_tender_bid
	 * @mbggenerated  Wed Nov 01 15:18:49 CST 2017
	 */
	int updateByPrimaryKeyWithBLOBs(TycEventsTenderBidCrawler record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tyc_events_tender_bid
	 * @mbggenerated  Wed Nov 01 15:18:49 CST 2017
	 */
	int updateByPrimaryKey(TycEventsTenderBidCrawler record);
}