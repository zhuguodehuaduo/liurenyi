package com.lry.service.studentService;

import com.lry.dao.studentDao.studentDao;
import com.lry.po.student.student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author liurenyi
 * @create 2019--12--21--16:43
 */
@Service
public class studentServiceImpl implements studentService {
    @Resource
    private studentDao dao;

    @Override
    public List<student> selectAll() {
        return dao.selectAll();
    }
}
