package mybatis.model;

public class TCertificate {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_certificate.certificateId
     *
     * @mbggenerated Wed Jul 19 15:57:12 CST 2017
     */
    private Integer certificateid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_certificate.name
     *
     * @mbggenerated Wed Jul 19 15:57:12 CST 2017
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_certificate.descr
     *
     * @mbggenerated Wed Jul 19 15:57:12 CST 2017
     */
    private String descr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_certificate.serverKey
     *
     * @mbggenerated Wed Jul 19 15:57:12 CST 2017
     */
    private String serverkey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_certificate.serverCrt
     *
     * @mbggenerated Wed Jul 19 15:57:12 CST 2017
     */
    private String servercrt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_certificate.certificateId
     *
     * @return the value of t_certificate.certificateId
     *
     * @mbggenerated Wed Jul 19 15:57:12 CST 2017
     */
    public Integer getCertificateid() {
        return certificateid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_certificate.certificateId
     *
     * @param certificateid the value for t_certificate.certificateId
     *
     * @mbggenerated Wed Jul 19 15:57:12 CST 2017
     */
    public void setCertificateid(Integer certificateid) {
        this.certificateid = certificateid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_certificate.name
     *
     * @return the value of t_certificate.name
     *
     * @mbggenerated Wed Jul 19 15:57:12 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_certificate.name
     *
     * @param name the value for t_certificate.name
     *
     * @mbggenerated Wed Jul 19 15:57:12 CST 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_certificate.descr
     *
     * @return the value of t_certificate.descr
     *
     * @mbggenerated Wed Jul 19 15:57:12 CST 2017
     */
    public String getDescr() {
        return descr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_certificate.descr
     *
     * @param descr the value for t_certificate.descr
     *
     * @mbggenerated Wed Jul 19 15:57:12 CST 2017
     */
    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_certificate.serverKey
     *
     * @return the value of t_certificate.serverKey
     *
     * @mbggenerated Wed Jul 19 15:57:12 CST 2017
     */
    public String getServerkey() {
        return serverkey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_certificate.serverKey
     *
     * @param serverkey the value for t_certificate.serverKey
     *
     * @mbggenerated Wed Jul 19 15:57:12 CST 2017
     */
    public void setServerkey(String serverkey) {
        this.serverkey = serverkey == null ? null : serverkey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_certificate.serverCrt
     *
     * @return the value of t_certificate.serverCrt
     *
     * @mbggenerated Wed Jul 19 15:57:12 CST 2017
     */
    public String getServercrt() {
        return servercrt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_certificate.serverCrt
     *
     * @param servercrt the value for t_certificate.serverCrt
     *
     * @mbggenerated Wed Jul 19 15:57:12 CST 2017
     */
    public void setServercrt(String servercrt) {
        this.servercrt = servercrt == null ? null : servercrt.trim();
    }
}