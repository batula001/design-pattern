package factoryPattern.goods;

import com.alibaba.fastjson.JSON;

public class GoodsService {
    public Boolean deliverGoods(DeliverReq deliverReq) {
        System.out.println("模拟发货实物商品" + JSON.toJSONString(deliverReq)); //把JSON请求转换为String类型
        return true;
    }
}

