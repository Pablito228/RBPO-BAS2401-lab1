# РБПО. Лабораторная работа №1

Проект использует Java 21, Maven и Spring Boot 3.5.5.
В `src/main/resources/application.yml` свойство `spring.application.name`
содержит номер студенческого билета.

## Сборка и запуск

```sh
mvn clean verify
java -jar target/rbpo-bas2401-lab1-0.0.1-SNAPSHOT.jar
```

## Проверка REST API

| Запрос | Ожидаемый ответ |
|---|---|
| `GET /api/greeting` | `{"message":"Hello from RBPO lab"}` |
| `GET /api/numbers` | `[1,2,3,4,5]` |

После запуска приложения:

```sh
curl http://localhost:8080/api/greeting
curl http://localhost:8080/api/numbers
```
