package factoryPattern.implement;

import com.alibaba.fastjson.JSON;
import factoryPattern.ICommodity;
import factoryPattern.coupon.CouponResult;
import factoryPattern.coupon.CouponService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Map;

public class CouponCommodityService implements ICommodity {
    Logger logger = LoggerFactory.getLogger(CouponCommodityService.class);
    CouponService couponService = new CouponService();


    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        CouponResult couponResult = couponService.sendCoupon(uId, commodityId, bizId);
        logger.info("请求参数[优惠券] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        logger.info("请求结果{}", JSON.toJSON(couponResult));
        if (!"0000".equals(couponResult.getCode())) throw new RuntimeException(couponResult.getInfo());


    }
}
