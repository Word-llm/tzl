package com.tzl.osms.service.impl;

import com.tzl.osms.entity.Order;
import com.tzl.osms.mapper.OrderMapper;
import com.tzl.osms.service.IOrderService;
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
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

}
