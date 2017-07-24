package mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Administrator on 2017/7/19.
 */

@SpringBootApplication
@MapperScan("mybatis.dao")
public class SampleAppliction {
    private Logger logger= LoggerFactory.getLogger(SampleAppliction.class);

    public static void main(String[] args) {
        SpringApplication.run(SampleAppliction.class,args);
    }
}
