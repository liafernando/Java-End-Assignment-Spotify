public class User {
    private boolean isPremium; // Boolean indicating whether the user is a premium user or not

    // Constructor
    public User(boolean isPremium) {
        this.isPremium = isPremium; // Initializes the isPremium with the provided value
    }

    // Method to check if the user is a premium user
    public boolean isPremium() {
        return isPremium; // Returns true if the user is a premium user, false otherwise
    }
}
