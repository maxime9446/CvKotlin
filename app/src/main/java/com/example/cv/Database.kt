package com.example.cv

data class CVData(
    val nom: String,
    val prenom: String,
    val adresse: String,
    val numero: String,
    val email: String,
    val competences: List<Competence>
)

data class Competence(
    val nom: String,
    val pourcentage: Int
)
object Database {
    val cvInfo = CVData(
        nom = "BECKER",
        prenom = "Maxime",
        adresse = "22 rue dans la République",
        numero = "0102030405",
        email = "becker.maxime@email.com",
        competences = listOf(
            Competence("Kotlin", 80),
            Competence("Android", 70),
            Competence("Java", 60)
        )
    )
}
