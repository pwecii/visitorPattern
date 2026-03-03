import java.util.HashMap;
import java.util.Map;

public class TelcoAllowance implements UsagePromo {

    private Map<String, String> dataOffers = new HashMap<>();

    public TelcoAllowance() {
        dataOffers.put("Smart", "15GB");
        dataOffers.put("Globe", "10GB");
        dataOffers.put("Ditto", "8GB");
    }

    @Override
    public String showAllowance(String telcoName, double money) {

        String data = dataOffers.get(telcoName);

        if (data != null) {
            return data + " for P" + money;
        } else {
            return "No available data offer.";
        }
    }
}