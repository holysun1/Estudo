plugins {
    id("java")
}

group = "br.com.dio"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.mysql:mysql-connector-j:8.3.0")
    implementation("org.flywaydb:flyway-core:12.10.0")   // O motor do Flyway
    implementation("org.flywaydb:flyway-mysql:12.10.0")  // O suporte ao MySQL
    // Informa ao Gradle que o Lombok só serve para AJUDAR a compilar o código
    compileOnly("org.projectlombok:lombok:1.18.32")

    // Informa ao Gradle que o Lombok precisa PROCESSAR as anotações (como @Getter, @Setter)
    annotationProcessor("org.projectlombok:lombok:1.18.32")
}

tasks.test {
    useJUnitPlatform()
}