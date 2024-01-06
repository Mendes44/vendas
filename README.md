# Influencer API

Este é um projeto de API desenvolvido em Java com Spring Boot para gerenciar influencers. A API oferece operações básicas de CRUD (Create, Read, Update, Delete) para cadastro e recuperação de informações sobre influencers.

## Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Data JPA
- H2 Database (para fins de demonstração)

## Configuração do Projeto



1. Execute o aplicativo Spring Boot:

    ```bash
    ./mvnw spring-boot:run
    ```

   O aplicativo estará acessível em `http://localhost:8080`.

## Endpoints da API

### Recuperar Todos os Influencers

```bash
curl --location 'http://localhost:8080/api/influencers'
```

### Casdastrar um novo Influencer

```bash
curl --location 'http://localhost:8080/api/influencers' \
--header 'Content-Type: application/json' \
--data-raw '{
   "name": "Anitta",
    "email": "anitta@anitta.com",
    "categories": ["Música"],
    "username": "anitta",
    "followers": 64900000,
    "following": 3289,
    "birthDate": "1987-01-03T17:41:30.115Z",
    "platform": "Instagram"
}'
```


### Recuperar todas as Categorias

```bash
curl --location 'http://localhost:8080/api/categorias'
```