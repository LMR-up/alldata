package com.platform.mall.mapper.mobile;

import java.util.List;

import com.platform.mall.entity.mobile.LitemallFeedback;
import com.platform.mall.entity.mobile.LitemallFeedbackExample;
import org.apache.ibatis.annotations.Param;

public interface LitemallFeedbackMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_feedback
     *
     * @mbg.generated
     */
    long countByExample(LitemallFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_feedback
     *
     * @mbg.generated
     */
    int deleteByExample(LitemallFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_feedback
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_feedback
     *
     * @mbg.generated
     */
    int insert(LitemallFeedback record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_feedback
     *
     * @mbg.generated
     */
    int insertSelective(LitemallFeedback record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_feedback
     *
     * @mbg.generated
     */
    LitemallFeedback selectOneByExample(LitemallFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_feedback
     *
     * @mbg.generated
     */
    LitemallFeedback selectOneByExampleSelective(@Param("example") LitemallFeedbackExample example, @Param("selective") LitemallFeedback.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_feedback
     *
     * @mbg.generated
     */
    List<LitemallFeedback> selectByExampleSelective(@Param("example") LitemallFeedbackExample example, @Param("selective") LitemallFeedback.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_feedback
     *
     * @mbg.generated
     */
    List<LitemallFeedback> selectByExample(LitemallFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_feedback
     *
     * @mbg.generated
     */
    LitemallFeedback selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallFeedback.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_feedback
     *
     * @mbg.generated
     */
    LitemallFeedback selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_feedback
     *
     * @mbg.generated
     */
    LitemallFeedback selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_feedback
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LitemallFeedback record, @Param("example") LitemallFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_feedback
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LitemallFeedback record, @Param("example") LitemallFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_feedback
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LitemallFeedback record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_feedback
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LitemallFeedback record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_feedback
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") LitemallFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_feedback
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}
