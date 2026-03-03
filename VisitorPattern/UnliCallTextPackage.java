import java.util.HashMap;
import java.util.Map;

public class UnliCallTextPackage implements UnliCallsTextOffer {

    private Map<String, String> unliOffers = new HashMap<>();

    public UnliCallTextPackage() {
        unliOffers.put("Globe", "Unlimited calls and texts within Globe network only.");
        unliOffers.put("Ditto", "Unlimited calls and texts to all networks.");
    }

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {

        if (!unliCallText) {
            return "No unlimited calls and texts.";
        }

        String offer = unliOffers.get(telcoName);

        if (offer != null) {
            return offer;
        } else {
            return "No unlimited calls and texts.";
        }
    }
}