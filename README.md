# РБПО. Лабораторная работа №1

Небольшой REST API со справочными данными о Солнечной системе. Проект использует Java 21, Spring Boot 3.5.5 и Maven. В `application.yml` свойство `spring.application.name` задано номером студенческого билета.

## Сборка и запуск

```sh
mvn clean verify
java -jar target/rbpo-bas2401-lab1-0.0.1-SNAPSHOT.jar
```

## Проверка

```sh
curl http://localhost:8080/api/observatory/description
curl http://localhost:8080/api/observatory/planet-counts
```

Первый запрос возвращает текст `A reference API for Solar System observations.` Второй возвращает JSON `{"rocky":4,"giants":4}` с количеством планет земной группы и планет-гигантов.
