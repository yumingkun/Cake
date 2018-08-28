package com.cake.service;

import com.cake.common.MybatisUtils;
import com.cake.entity.Category;
import com.cake.mapper.CategoryMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * 查看有多少个分类
 */
public class CategoryService {
    /**
     *查询全部蛋糕分类
     * @return 全部蛋糕分类
     */
    public List<Category> getCategories(){
        SqlSession sqlSession=MybatisUtils.openSession();

        try{
            CategoryMapper categoryMapper=sqlSession.getMapper(CategoryMapper.class);
            return categoryMapper.getCategories();
        }finally {
            sqlSession.close();
        }
    }
    /**
     * 插入蛋糕分类信息
     * @param category  蛋糕分类实体
     */
    public void addCategory(Category category) {
        Date now = new Date();
        category.setCreateTime(now);
        category.setUpdateTime(now);
        SqlSession sqlSession = MybatisUtils.openSession();
        try {
            CategoryMapper mapper = sqlSession.getMapper(CategoryMapper.class);
            mapper.addCategory(category);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

}
