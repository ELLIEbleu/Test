package mybatis;


import com.alibaba.fastjson.JSONObject;
import mybatis.dao.TCertificateMapper;
import mybatis.model.TCertificate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/7/19.
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        TCertificateMapper mapper= (TCertificateMapper) ac.getBean("TCertificateMapper");
        TCertificate tCertificate=mapper.selectByPrimaryKey(1);
        System.out.println(JSONObject.toJSONString(tCertificate));
    }
}
