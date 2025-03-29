# 1️⃣ Utiliser une image de base avec JDK
FROM openjdk:17-jdk-slim

# 2️⃣ Définir le dossier de travail dans le conteneur
WORKDIR /app

# 3️⃣ Copier le fichier JAR généré
COPY ./target/devsecops-project-1.0-SNAPSHOT.jar /app/monapp.jar


# 4️⃣ Exposer le port sur lequel l’application tourne
EXPOSE 8081

# 5️⃣ Lancer l’application au démarrage du conteneur
CMD ["java", "-jar", "monapp.jar"]

