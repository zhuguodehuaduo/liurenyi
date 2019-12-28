package com.lry.dao.studentDao;

import com.lry.po.student.student;

import java.util.List;

/**
 * @author liurenyi
 * @create 2019--12--21--16:31
 */
public interface studentDao {
    List<student> selectAll();
}
