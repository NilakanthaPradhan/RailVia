# 🚆 Smart Train Availability Finder (Buffer-Time Based)

A smart railway search system that shows train availability across multiple stations by using a buffer-time logic.  
It helps users discover valid train journeys even when there is no direct source-to-destination match.

---

## 🧠 Problem Statement

Most railway booking systems only show trains that:
- Start exactly at the selected source station
- End exactly at the selected destination station

This approach ignores many valid journeys where:
- Trains pass through nearby stations
- Passengers can travel with a small buffer time
- Practical train options exist but are not shown

---

## 💡 Solution

This project introduces a buffer-time based search mechanism that:
- Allows searching trains between any two stations
- Considers intermediate stations
- Applies a configurable buffer time between arrivals and departures
- Returns more realistic and useful train options

### Example
If a train arrives at Station A at **10:00** and another connection departs at **10:30**,  
and the buffer time is **45 minutes**, the journey is considered valid.

---

## ✨ Features

- 🚉 Search trains between any two stations
- ⏱️ Configurable buffer time
- 🔄 Supports indirect routes
- 📊 Optimized filtering logic
- 🌐 REST APIs using Spring Boot
- 🧩 Easily extendable architecture

---

## 🏗️ Tech Stack

- Java
- Spring Boot
- REST APIs
- Maven
- Git & GitHub

---

## 🔍 High-Level Flow

1. User provides source station, destination station, and buffer time
2. System fetches all trains passing through nearby stations
3. Buffer-time constraints are applied
4. Valid train journeys are returned

---

## 🚀 Future Enhancements

- Integration with real railway APIs
- Seat availability and fare calculation
- Route visualization
- Frontend application
- Smart recommendations

---

## 👨‍💻 Author

Nilakantha Pradhan 
Software Engineer | Backend Developer

---

## 📜 License

This project is created for learning, experimentation, and innovation purposes.
