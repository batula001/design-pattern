package factoryPattern;

import factoryPattern.implement.CardCommodityService;
import factoryPattern.implement.CouponCommodityService;
import factoryPattern.implement.GoodsCommodityService;

import java.util.HashMap;
import java.util.Map;

public class StoryFactory {

    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) return null;
        if (3 == commodityType) return new CardCommodityService();
        if (1 == commodityType) return new CouponCommodityService();
        if (2 == commodityType) return new GoodsCommodityService();
        throw new RuntimeException("不存在该类型");
    }


}
