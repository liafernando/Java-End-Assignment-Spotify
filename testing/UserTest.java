import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void isPremium() {
        // Test with a premium user
        User premiumUser = new User(true);
        assertTrue(premiumUser.isPremium(), "isPremium should return true for a premium user.");

        // Test with a non-premium user
        User nonPremiumUser = new User(false);
        assertFalse(nonPremiumUser.isPremium(), "isPremium should return false for a non-premium user.");
    }
}
