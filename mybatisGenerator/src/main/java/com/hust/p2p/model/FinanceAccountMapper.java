package com.hust.p2p.model;

import com.hust.p2p.model.FinanceAccount;

public interface FinanceAccountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_finance_account
     *
     * @mbggenerated Thu Oct 08 13:47:52 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_finance_account
     *
     * @mbggenerated Thu Oct 08 13:47:52 CST 2020
     */
    int insert(FinanceAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_finance_account
     *
     * @mbggenerated Thu Oct 08 13:47:52 CST 2020
     */
    int insertSelective(FinanceAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_finance_account
     *
     * @mbggenerated Thu Oct 08 13:47:52 CST 2020
     */
    FinanceAccount selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_finance_account
     *
     * @mbggenerated Thu Oct 08 13:47:52 CST 2020
     */
    int updateByPrimaryKeySelective(FinanceAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_finance_account
     *
     * @mbggenerated Thu Oct 08 13:47:52 CST 2020
     */
    int updateByPrimaryKey(FinanceAccount record);
}