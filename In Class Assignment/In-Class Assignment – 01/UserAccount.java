public class UserAccount {
    private String username;
    private String emailAddress;
    private String accountStatus;
    private int failedLoginAttempts;
    private String password;

    public UserAccount(String username, String emailAddress, String accountStatus, int failedLoginAttempts, String password) {
        this.username = username;
        this.emailAddress = emailAddress;
        this.accountStatus = accountStatus;
        this.failedLoginAttempts = failedLoginAttempts;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getFailedLoginAttempts() {
        return failedLoginAttempts;
    }

    public void setFailedLoginAttempts(int failedLoginAttempts) {
        if (failedLoginAttempts < 0) {
            System.out.println("Invalid value: Failed login attempts cannot be negative.");
        } else {
            this.failedLoginAttempts = failedLoginAttempts;
        }
    }

    public void login(String enteredPassword) {
        if (enteredPassword.equals(password)) {
            System.out.println("Login successful.");
            failedLoginAttempts = 0;
        } else {
            failedLoginAttempts++;
            System.out.println("Login failed.");
        }
    }

    public void lockCheck() {
        if (failedLoginAttempts >= 3) {
            accountStatus = "Locked";
            System.out.println("Warning: Account is locked.");
        } else {
            System.out.println("Account is active.");
        }
    }
    
        public static void main(String[] args) {
            UserAccount user1 = new UserAccount(
                "Navitha",
                "navitha@gmail.com",
                "Active",
                0,
                "abc123"
            );

            System.out.println("Username: " + user1.getUsername());

            user1.setFailedLoginAttempts(-2);

            user1.login("abc123");
            user1.lockCheck();

            user1.login("wrong1");
            user1.login("wrong2");
            user1.login("wrong3");

            user1.lockCheck();
        }
}