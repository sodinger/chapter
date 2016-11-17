package com.xue.chapter2.service;

import com.xue.chapter2.model.Customer;

import java.util.List;
import java.util.Map;

/**
 * 提供客户数据服务，客户的一切数据写入与输出
 * Created by xnl on 2016/11/16.
 */
public class CustomerService {

    /**
     * 获取客户列表
     * @param keyword
     * @return
     */
    public List<Customer> getCustomerList(String keyword) {
        // TODO

        return null;
    }

    /**
     * 根据id获取客户对象
     * @param id
     * @return
     */
    public Customer getCustomer(long id) {
        // TODO
        return null;
    }

    /**
     * 创建客户对象
     * @param fieldMap 表单参数
     * @return
     */
    public boolean createCustomer(Map<String, Object> fieldMap) {
        // TODO
        return false;
    }

    /**
     * 根据客户id更新客户信息
     * @param id 客户id
     * @param fieldMap 表单参数
     * @return
     */
    public boolean updateCustomer(long id, Map<String, Object> fieldMap) {
        // TODO
        return false;
    }

    /**
     * 根据客户id删除客户信息
     * @param id
     * @return
     */
    public boolean deleteCustomer(long id) {
        // TODO
        return false;
    }

}
