package mybatis.service.impl;

import mybatis.dao.TNginxGroupMapper;
import mybatis.model.TNginxGroup;
import mybatis.service.NginxGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/7/19.
 */
@Service
public class NginxGroupServiceImpl implements NginxGroupService {
    @Autowired
    private TNginxGroupMapper nginxGroupMapper;

    @Override
    public void insert(TNginxGroup nginxGroup) {
         nginxGroupMapper.insert(nginxGroup);
    }
}
