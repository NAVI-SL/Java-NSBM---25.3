class SecurityAnalyst {
    static int totalAnalysts = 0;

    String analystID;
    String name;
    String specialization;
    int clearanceLevel;

    SecurityAnalyst() {
        analystID = "Unknown";
        name = "Unknown";
        specialization = "General";
        clearanceLevel = 1;
        totalAnalysts++;
    }

    SecurityAnalyst(String id, String analystName, String spec, int level) {
        analystID = id;
        name = analystName;
        specialization = spec;
        clearanceLevel = level;
        totalAnalysts++;
    }

    void getProfile() {
        System.out.println("Analyst ID: " + analystID);
        System.out.println("Name: " + name);
        System.out.println("Specialization: " + specialization);
        System.out.println("Clearance Level: " + clearanceLevel);
    }

    static int getTotalAnalysts() {
        return totalAnalysts;
    }
}

class Main {
    public static void main(String[] args) {
        SecurityAnalyst analyst1 = new SecurityAnalyst();

        SecurityAnalyst analyst2 = new SecurityAnalyst(
            "A001",
            "John",
            "Malware Analysis",
            4
        );

        analyst1.getProfile();

        System.out.println();

        analyst2.getProfile();

        System.out.println();

        System.out.println("Total Analysts: " + SecurityAnalyst.getTotalAnalysts());
    }
}