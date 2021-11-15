package factoryPattern.card;

public class IQiYiCardService {
    public void grantToken(String bindMobileNumber, String cardId) {
        System.out.println("爱奇艺会员卡" + bindMobileNumber + "," + cardId);
    }
}
