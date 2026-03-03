public class UnliCallTextPackage implements UnliCallTextOffer {

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {

        if (!unliCallText) {
            return "No unlimited calls and texts. Charges apply per use.";
        }

        if (telcoName.equalsIgnoreCase("Globe")) {
            return "Unlimited calls and texts within Globe network only.";
        } 
        else if (telcoName.equalsIgnoreCase("Ditto")) {
            return "Unlimited calls and texts to all networks nationwide.";
        } 
        else {
            return "No unlimited call/text offer.";
        }
    }
}