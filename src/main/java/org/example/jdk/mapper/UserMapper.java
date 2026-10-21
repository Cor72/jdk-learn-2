package org.example.jdk.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.jdk.entity.User;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
