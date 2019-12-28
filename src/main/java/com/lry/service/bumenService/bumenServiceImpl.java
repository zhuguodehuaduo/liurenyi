package com.lry.service.bumenService;

import com.lry.dao.bumenDao.bumenDao;
import com.lry.po.bumen.bumen;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author liurenyi
 * @create 2019--12--21--16:42
 */
@Service
public class bumenServiceImpl implements bumenService {
    @Resource
    private bumenDao dao;

    @Override
    public List<bumen> selectAll() {
        return dao.selectAll();
    }
}
