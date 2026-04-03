# Category One: Software Design and Engineering

## 📄 Artifact Description
The artifact showcased here is the **SNHU Travel System**, originally developed in Java during my CS 250 course in 2024. Its primary purpose is to manage and display a top-five list of curated vacation destinations using the Java Swing framework.

## ⚖️ Justification for Inclusion
I selected this artifact for my ePortfolio because it perfectly demonstrates my evolution as a developer—moving from basic coding mechanics to professional architecture. 
* **The Problem:** The original project was highly tightly coupled, violating the Single Responsibility Principle by mixing user interface code with data loading logic.
* **The Solution:** I refactored the monolith into a clean **Model-View-Controller (MVC)** design pattern. 
* **New Skills Showcased:** By separating the data modeling from the UI rendering, I introduced automated testing capabilities and improved software maintainability.

## 🎯 Alignment with Course Outcomes
This enhancement fulfills the planned objectives established early in the capstone:
* **Outcome 3 (Industry Standards):** I designed a solution using established architectural practices (MVC), effectively managing the trade-offs between quick, messy code and structured, scalable development.
* **Outcome 4 (Innovative Tools):** I integrated unit testing checks to ensure regression issues are caught immediately, bridging technical computer science skills with my extensive 11-year history in software testing.

## 💭 Reflection on the Process
Refactoring legacy code is often harder than writing something new. 
* **What I Learned:** I learned that proper software engineering requires active defensive programming. Making sure data and UI do not cross boundaries makes tracking down bugs drastically faster.
* **Challenges:** A main challenge was ensuring the custom cell renderer still mapped correctly to the new data objects after extracting them from the frame. This forced me to evaluate object-oriented coupling deeply.
