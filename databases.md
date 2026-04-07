# Category Three: Databases

## 📄 Artifact Description
The artifact selected for this enhancement is the **Quantigration database** project, originally developed in DAD 220 in December 2023. This database was designed to manage business data related to orders, collaborators, and return merchandise authorizations (RMAs). The system uses relational tables and SQL queries to analyze product returns and identify patterns in customer behavior. While the original project demonstrated foundational SQL skills, it relied on direct queries and lacked structured methods for improving security, abstraction, and maintainability.

## ⚖️ Justification for Inclusion
I selected this artifact because it allowed me to focus on improving database structure and security using more advanced SQL techniques. In its original form, the database relied on direct joins and queries, which can become difficult to manage and may expose underlying table relationships.
* **The Problem:** The original project relied on raw, direct queries to the tables, exposing sensitive data and requiring manual table joins every time an analyst needed a report.
* **The Solution:** Using **DBeaver** and SQLite, I refactored the execution plan to include restrictive database Views.
* **New Skills Showcased:** I implemented a database view called GetReturnStatistics, which encapsulates complex join logic between the Collaborators, Orders, and RMA tables. This enhancement improves readability, reusability, and maintainability by allowing users to access structured data without needing to rewrite complex SQL queries. I also created a second view, SecureRMAReview, which applies filtering conditions to return only completed RMAs. This demonstrates defensive data access by restricting the dataset to only relevant and finalized records.

## 🎯 Alignment with Course Outcomes
This enhancement fulfills the planned objectives established early in the capstone:
* **Outcome 4 (Innovative Techniques):** I applied structured database techniques to improve system organization and usability. By implementing views, I demonstrated my ability to create reusable and efficient database components that support business analysis.
* **Outcome 5 (Security Mindset):** I developed a secure data infrastructure by implementing the principle of least privilege. By restricting direct raw access to the tables and funneling analysts through specific views, I protected system integrity.

## 💭 Reflection on the Process
Modifying this database provided a deep understanding of standard industry security procedures.
* **What I Learned:** I gained a stronger understanding of how database abstraction can improve both usability and security. My experience in software testing has shown me that complex queries can lead to errors and inconsistencies if they are repeatedly rewritten, and using views helps standardize data access.
* **Challenges:** A primary challenge I encountered was ensuring that the joins and filters within the views returned accurate and meaningful results. I had to carefully test the relationships between tables to confirm that the output reflected the intended business logic.
Overall, this process reinforced the importance of designing databases that are not only functional but also maintainable and secure. By implementing views, I was able to improve the structure of the database while also demonstrating a more professional approach to data management.
