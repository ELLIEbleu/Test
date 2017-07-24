package mybatis.dao;

import mybatis.model.TNginxGroup;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TNginxGroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_nginx_group
     *
     * @mbggenerated Wed Jul 19 15:57:12 CST 2017
     */
    int deleteByPrimaryKey(Integer nginxgroupid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_nginx_group
     *
     * @mbggenerated Wed Jul 19 15:57:12 CST 2017
     */
    int insert(TNginxGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_nginx_group
     *
     * @mbggenerated Wed Jul 19 15:57:12 CST 2017
     */
    int insertSelective(TNginxGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_nginx_group
     *
     * @mbggenerated Wed Jul 19 15:57:12 CST 2017
     */
    TNginxGroup selectByPrimaryKey(Integer nginxgroupid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_nginx_group
     *
     * @mbggenerated Wed Jul 19 15:57:12 CST 2017
     */
    int updateByPrimaryKeySelective(TNginxGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_nginx_group
     *
     * @mbggenerated Wed Jul 19 15:57:12 CST 2017
     */
    int updateByPrimaryKey(TNginxGroup record);
}