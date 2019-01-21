package com.miaoshaproject.validator;

import org.springframework.beans.factory.InitializingBean;

import javax.validation.Validation;
import javax.validation.Validator;

/**
 * @Author: Alan.W
 * @Date: 2019/1/21 10:37
 */
public class ValidatorImpl implements InitializingBean {

    private Validator validator;

    @Override
    public void afterPropertiesSet() throws Exception {
        // 将hibernate validator通过工厂的初始化方式使其实例化
        this.validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

}
