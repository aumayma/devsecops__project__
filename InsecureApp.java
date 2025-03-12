public class InsecureApp {
    public static void main(String[] args) {
        System.out.println("Connexion à la base de données...");
        String dbUsername = "admin";
        String dbPassword = "SuperSecret123";  // 🔴 SECRET ICI !!
        
        System.out.println("Connexion API...");
        String apiKey = "sk_test_51H4hDQqRfLZyFakeKey";  // 🔴 SECRET ICI !!
    }
}
