package com.xuecheng.manage_course.dao;

import com.xuecheng.framework.domain.course.TeachplanMedia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Kiku
 * @date 2019/7/12 19:17
 */
public interface TeachplanMediaRepository extends JpaRepository<TeachplanMedia,String> {

    /**
     * 根据课程id查询课程计划媒资信息
     * @param courseId
     * @return
     */
    List<TeachplanMedia> findByCourseId(String courseId);
}
