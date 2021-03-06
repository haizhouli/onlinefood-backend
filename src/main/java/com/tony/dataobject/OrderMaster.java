package com.tony.dataobject;

import com.tony.enums.OrderStatusEnum;
import com.tony.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@DynamicUpdate
public class OrderMaster {

    @Id
    private  String orderId;

    private  String  buyerName;

    private  String buyerPhone;

    private  String buyerAddress;

    private  String buyerOpenid;

    private BigDecimal orderAmount;

    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    private Integer payStatus = PayStatusEnum.UNPAID.getCode();

    private Date createTime;

    private Date updateTime;


}
