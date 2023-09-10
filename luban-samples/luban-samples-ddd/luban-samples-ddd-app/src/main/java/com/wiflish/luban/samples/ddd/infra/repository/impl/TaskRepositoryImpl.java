package com.wiflish.luban.samples.ddd.infra.repository.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wiflish.luban.core.infra.converter.BaseConverter;
import com.wiflish.luban.core.mybatis.repository.impl.BaseMybatisRepositoryImpl;
import com.wiflish.luban.samples.ddd.infra.po.TaskPO;
import com.wiflish.luban.samples.ddd.domain.entity.Task;
import com.wiflish.luban.samples.ddd.domain.repository.TaskRepository;
import com.wiflish.luban.samples.ddd.dto.query.TaskQuery;
import com.wiflish.luban.samples.ddd.infra.converter.TaskConverter;
import com.wiflish.luban.samples.ddd.infra.mapper.TaskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author wiflish
 * @since 2023-08-28
 */
@Repository
public class TaskRepositoryImpl extends BaseMybatisRepositoryImpl<TaskQuery, Task, TaskPO> implements TaskRepository {
    @Autowired
    private TaskMapper taskMapper;

    @Autowired
    private TaskConverter taskConverter;

    @Override
    protected BaseMapper<TaskPO> getMapper() {
        return taskMapper;
    }

    @Override
    protected BaseConverter<Task, TaskPO> getConverter() {
        return taskConverter;
    }
}