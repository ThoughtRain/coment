package com.prarui.coment.mapper;

import com.prarui.coment.bean.Emp;
import com.prarui.coment.bean.Orders;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MepMapper {
    //   List<OrdersCustomer> findOrdersUser();

    /**获得员工通过员工编号*/
    Emp getEmpById_1(int id);

}
