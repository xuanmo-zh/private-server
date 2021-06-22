package com.design.pattern.factory.method;

import com.design.pattern.factory.pojo.mobile.HuaweiMobileProduct;
import com.design.pattern.factory.pojo.mobile.MobileProduct;

/**
 * 具体产品工厂-实例化具体产品
 * 华为移动设备工厂
 * @author 玄墨
 * @date 2021/6/21 7:37 下午
 */
public class HuaweiMobileFactory extends AbstractMobileFactory {


    @Override
    public MobileProduct genarateProduct() {
        return new HuaweiMobileProduct();
    }
}
