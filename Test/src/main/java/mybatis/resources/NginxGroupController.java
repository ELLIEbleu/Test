package mybatis.resources;


import mybatis.model.TNginxGroup;
import mybatis.service.NginxGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.POST;


/**
 * Created by Administrator on 2017/7/19.
 */
@RestController
public class NginxGroupController {
    @Autowired
    private NginxGroupService nginxGroupService;

    @RequestMapping(path = "/nginxGroup",method = POST)
    public void   insert(@RequestBody TNginxGroup nginxGroup){
        nginxGroupService.insert(nginxGroup);
    }
}
