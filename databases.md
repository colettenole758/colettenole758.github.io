# Category Three: Database Security and Optimization

## 📄 Artifact Description
The artifact showcased here is the **Quantigration Database**, originally developed in SQL for my DAD 220 course in late 2023. Its primary function was to track and analyze Return Merchandise Authorizations (RMAs) to discover product failure trends.

## ⚖️ Justification for Inclusion
I selected this artifact for the database category because it allowed me to demonstrate proficiency in database administration and advanced querying techniques outside of standard table structures. 
* **The Problem:** The original project relied on raw, direct queries to the tables, exposing sensitive data and requiring manual table joins every time an analyst needed a report.
* **The Solution:** Using **DBeaver** and SQLite, I refactored the execution plan to include restrictive database Views. 
* **New Skills Showcased:** I created an encapsulated view that handles complex, multi-table joins automatically. Additionally, I built a secondary, limited view to hide sensitive data and active orders from basic analysts, applying data abstraction directly at the source.

## 🎯 Alignment with Course Outcomes
This enhancement fulfills the planned objectives established early in the capstone:
* **Outcome 4 (Innovative Techniques):** I utilized specialized database design patterns (Views) to deliver business value and clean up application-side logic.
* **Outcome 5 (Security Mindset):** I developed a secure data infrastructure by implementing the principle of least privilege. By restricting direct raw access to the tables and funneling analysts through specific views, I protected system integrity.

## 💭 Reflection on the Process
Modifying this database provided a deep understanding of standard industry security procedures.
* **What I Learned:** I learned that proper data management requires treating your database as an active defense barrier. Hiding raw table logic not only keeps the system organized but actively limits attack vectors.
* **Challenges:** A primary challenge I faced was that my original university cloud environment had been archived. To overcome this, I pivoted to setting up a local mock database using DBeaver. This forced me to adjust my SQL scripts to work across different SQL environments, which ultimately proved my ability to problem-solve and adapt to missing infrastructure.
