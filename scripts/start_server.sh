#!/bin/bash
echo "Démarrage du serveur..."
java -jar target/app.jar
export DB_USER="admin"
export DB_PASS="supersecret"
