public class TelcoAllowance implements UsagePromo {

    @Override
    public String showAllowance(String telcoName, double money) {

        if (telcoName.equalsIgnoreCase("Smart")) {
            return "15 GB for P" + money;
        } 
        else if (telcoName.equalsIgnoreCase("Globe")) {
            return "10 GB for P" + money;
        } 
        else if (telcoName.equalsIgnoreCase("Ditto")) {
            return "8 GB for P" + money;
        } 
        else {
            return "No data offer available.";
        }
    }
}