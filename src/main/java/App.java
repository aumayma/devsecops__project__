public class App {
    public static void main(String[] args) {
        // Vérifier la présence de secrets avant de démarrer
        if (containsSecrets()) {
            throw new RuntimeException("🚨 ERREUR : Des secrets ont été détectés ! L'application ne peut pas démarrer.");
        }

        System.out.println("Bienvenue dans l'application DevSecOps !");
    }

    public static boolean containsSecrets() {
        String dbPassword = "SuperSecret123";
        String apiKey = "sk_test_51H4hDQqRfLZyFakeKey";

        return dbPassword.contains("SuperSecret123") || apiKey.contains("sk_test_");
    }
}

