public class SecurityAlertSystem {
     String alertID;
    String threatType;
    String severityLevel;

    public SecurityAlertSystem(String alertID,String threatType,String severityLevel) {
        this.alertID = alertID;
        this.threatType = threatType;
        this.severityLevel = severityLevel;
    }

    public void displayAlert() {

        System.out.println("Alert ID      : " + alertID);
        System.out.println("Threat Type   : " + threatType);
        System.out.println("Severity Level: " + severityLevel);
        System.out.println();
    }

    public static void main(String[] args) {

        SecurityAlertSystem alert1 =
                new SecurityAlertSystem("A101", "Malware", "High");

        SecurityAlertSystem alert2 =
                new SecurityAlertSystem("A102", "Phishing", "Medium");

        alert1.displayAlert();
        alert2.displayAlert();
    }
}
