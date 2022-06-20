package com.jamscoco.service.impl;

import com.jamscoco.entity.Operation;
import com.jamscoco.mapper.OperationMapper;
import com.jamscoco.service.IOperationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author JAMScoco
 * @since 2022-06-20
 */
@Service
public class OperationServiceImpl extends ServiceImpl<OperationMapper, Operation> implements IOperationService {

}
