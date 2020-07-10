package com.tzl.osms.service.impl;

import com.tzl.osms.entity.User;
import com.tzl.osms.mapper.UserMapper;
import com.tzl.osms.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 沐纤云
 * @since 2020-07-10
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
