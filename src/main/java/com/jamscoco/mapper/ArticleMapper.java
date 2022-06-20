package com.jamscoco.mapper;

import com.jamscoco.entity.Article;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author JAMScoco
 * @since 2022-06-20
 */
@Mapper
public interface ArticleMapper extends BaseMapper<Article> {

}
