package com.hust.p2p.model;

import com.hust.p2p.model.LoanInfo;

public interface LoanInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_loan_info
     *
     * @mbggenerated Thu Oct 08 13:47:52 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_loan_info
     *
     * @mbggenerated Thu Oct 08 13:47:52 CST 2020
     */
    int insert(LoanInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_loan_info
     *
     * @mbggenerated Thu Oct 08 13:47:52 CST 2020
     */
    int insertSelective(LoanInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_loan_info
     *
     * @mbggenerated Thu Oct 08 13:47:52 CST 2020
     */
    LoanInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_loan_info
     *
     * @mbggenerated Thu Oct 08 13:47:52 CST 2020
     */
    int updateByPrimaryKeySelective(LoanInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_loan_info
     *
     * @mbggenerated Thu Oct 08 13:47:52 CST 2020
     */
    int updateByPrimaryKeyWithBLOBs(LoanInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_loan_info
     *
     * @mbggenerated Thu Oct 08 13:47:52 CST 2020
     */
    int updateByPrimaryKey(LoanInfo record);
}