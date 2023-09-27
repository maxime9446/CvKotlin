package com.example.cv

data class CVData(
    val nom: String,
    val prenom: String,
    val adresse: String,
    val numero: String,
    val email: String,
    val competences: List<String>
)

object Database {
    val cvInfo = CVData(
        nom = "BECKER",
        prenom = "Maxime",
        adresse = "22 rue dans la République",
        numero = "0102030405",
        email = "becker.maxime@email.com",
        competences = listOf("Kotlin", "Android", "Java")
    )
}
