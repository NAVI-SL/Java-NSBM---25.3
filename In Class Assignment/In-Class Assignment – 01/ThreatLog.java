public class ThreatLog {
    int score1;
    int score2;
    int score3;
    int score4;
    int score5;

    ThreatLog(int s1, int s2, int s3, int s4, int s5) {
        score1 = s1;
        score2 = s2;
        score3 = s3;
        score4 = s4;
        score5 = s5;
    }

    String getClassification(int score) {
        if (score >= 80) {
            return "Critical";
        } else if (score >= 60) {
            return "High";
        } else if (score >= 40) {
            return "Medium";
        } else {
            return "Low";
        }
    }

    void printReport() {
        System.out.println("Score 1: " + score1 + " - " + getClassification(score1));
        System.out.println("Score 2: " + score2 + " - " + getClassification(score2));
        System.out.println("Score 3: " + score3 + " - " + getClassification(score3));
        System.out.println("Score 4: " + score4 + " - " + getClassification(score4));
        System.out.println("Score 5: " + score5 + " - " + getClassification(score5));
    }

    int getHighestThreat() {
        int highest = score1;

        if (score2 > highest) {
            highest = score2;
        }

        if (score3 > highest) {
            highest = score3;
        }

        if (score4 > highest) {
            highest = score4;
        }

        if (score5 > highest) {
            highest = score5;
        }

        return highest;
    }

    int countCritical() {
        int count = 0;

        if (score1 >= 80) {
            count++;
        }

        if (score2 >= 80) {
            count++;
        }

        if (score3 >= 80) {
            count++;
        }

        if (score4 >= 80) {
            count++;
        }

        if (score5 >= 80) {
            count++;
        }

        return count;
    }



    public static void main(String[] args) {
        ThreatLog log1 = new ThreatLog(91, 55, 38, 74, 62);

        log1.printReport();

        System.out.println("Highest Threat Score: " + log1.getHighestThreat());
        System.out.println("Critical Threat Count: " + log1.countCritical());
    }

}