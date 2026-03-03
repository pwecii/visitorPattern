public class Telco implements TelcoSubscription {

    private int dataAllowance;
    private double promoPrice;
    private String telcoName;
    private boolean unliCallText;

    public Telco(int dataAllowance, double promoPrice, String telcoName, boolean unliCallText) {
        this.dataAllowance = dataAllowance;
        this.promoPrice = promoPrice;
        this.telcoName = telcoName;
        this.unliCallText = unliCallText;
    }

    @Override
    public String accept(UsagePromo promo, double promoPrice) {
        return promo.showAllowance(telcoName, this.promoPrice);
    }

    @Override
    public String accept(UnliCallsTextOffer offer, boolean unliCallText) {
        return offer.showUnliCallsTextOffer(telcoName, this.unliCallText);
    }


    public String getTelcoName() {
        return telcoName;
    }

    public double getPromoPrice() {
        return promoPrice;
    }

    public boolean getUnliCallText() {
        return unliCallText;
    }

    public int getDataAllowance() {
        return dataAllowance;
    }
}