# 🚀 Kafka & Spring Cloud Streams Playground

A hands-on, practical exploration of **Apache Kafka**, **Spring Cloud Streams**, and modern **Java functional paradigms**. This repository demonstrates core event-driven architectural concepts, ranging from low-level serialization to high-level multi-topic functional processing.

---

## 📌 Project Overview

The primary goal of this repository is to showcase real-world Kafka integration patterns using Java and the Spring ecosystem. It covers both raw Kafka configurations and the abstraction layers provided by Spring Cloud Stream and Spring Cloud Function.

### Key Concepts & Features Covered

- 📦 **Custom Object Serialization & Deserialization:** Passing complex Java objects using custom Jackson/JSON or Avro serializers/deserializers (`Serializer<T>`, `Deserializer<T>`).
- 👥 **Consumer Groups & Scaling:** Demonstrating parallel stream processing, rebalancing mechanisms, and offset management across multiple consumer instances.
- 🔀 **Partitions & Load Balancing:** Custom partitioning strategies, key-based message routing, and order guarantees within partitions.
- ⚡ **Functional Java Interfaces:** Utilizing Java 8+ features (`Function<T, R>`, `Consumer<T>`, `Supplier<T>`) for clean stream processing pipelines.
- ☁️ **Spring Cloud Functions & Streams:** Decoupling business logic from messaging middleware via Spring Cloud Stream abstraction (`spring.cloud.stream.bindings`).
- 🌐 **Multi-Topic Processing:** Ingesting from multiple input topics, transforming event payloads, and routing output to downstream topics dynamically.

---

## 🛠️ Tech Stack & Prerequisites

- **Java Version:** Java 17 / 21+
- **Framework:** Spring Boot 3.x / Spring Cloud Stream
- **Event Streaming:** Apache Kafka (Confluent Local / Docker Container)
- **Build Tool:** Maven / Gradle

---

## 🏗️ Repository Architecture

```text
├── src/main/java/com/example/kafka
│   ├── config/            # Custom Serializer/Deserializer & Kafka Configs
│   ├── functions/         # Java Functional Interfaces (Consumer, Supplier, Function)
│   ├── model/             # DTOs / Event Payloads for Java object passing
│   ├── producer/          # Custom Partition Producers
│   └── streams/           # Spring Cloud Stream bindings & multi-topic routing
└── src/main/resources/
    └── application.yml    # Spring Cloud Stream bindings & consumer group configs
