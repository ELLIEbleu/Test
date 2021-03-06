package mybatis.dao;

import mybatis.model.TCertificate;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TCertificateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_certificate
     *
     * @mbggenerated Wed Jul 19 15:57:12 CST 2017
     */
    int deleteByPrimaryKey(Integer certificateid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_certificate
     *
     * @mbggenerated Wed Jul 19 15:57:12 CST 2017
     */
    int insert(TCertificate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_certificate
     *
     * @mbggenerated Wed Jul 19 15:57:12 CST 2017
     */
    int insertSelective(TCertificate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_certificate
     *
     * @mbggenerated Wed Jul 19 15:57:12 CST 2017
     */
    TCertificate selectByPrimaryKey(Integer certificateid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_certificate
     *
     * @mbggenerated Wed Jul 19 15:57:12 CST 2017
     */
    int updateByPrimaryKeySelective(TCertificate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_certificate
     *
     * @mbggenerated Wed Jul 19 15:57:12 CST 2017
     */
    int updateByPrimaryKeyWithBLOBs(TCertificate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_certificate
     *
     * @mbggenerated Wed Jul 19 15:57:12 CST 2017
     */
    int updateByPrimaryKey(TCertificate record);
}