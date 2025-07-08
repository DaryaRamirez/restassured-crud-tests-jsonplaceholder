# 📡 API Tests: JSONPlaceholder (CRUD + Positive & Negative Scenarios)

This project contains automated API tests for the public [JSONPlaceholder](https://jsonplaceholder.typicode.com/) API using:

- **Java 17**
- **RestAssured**
- **Cucumber**
- **TestNG**
- **Allure Reports**
- **GitHub Actions** for CI

---

## 📁 Project Structure

├── src
│ ├── test
│ │ ├── java
│ │ │ └── stepdefs
│ │ │ └── UserApiSteps.java
│ │ └── resources
│ │ └── features
│ │ ├── positive_scenarios.feature
│ │ └── negative_scenarios.feature
├── .github
│ └── workflows
│ └── api-tests.yml
├── pom.xml
└── README.md

yaml
Copy
Edit

---

## 🚀 How to Run Tests

### 1. Run all tests locally
```bash
mvn clean test
2. Run only positive or negative tests
bash
Copy
Edit
mvn test -Dcucumber.filter.tags="@positive"
mvn test -Dcucumber.filter.tags="@negative"
📊 Allure Report
1. Generate Allure report
bash
Copy
Edit
mvn allure:report
2. Serve it in browser
bash
Copy
Edit
mvn allure:serve
⚙️ CI/CD: GitHub Actions
Each push to main triggers tests and uploads results.
Check the .github/workflows/api-tests.yml for pipeline details.

🧪 Sample Test Scenarios
✅ GET user by ID — 200 OK

✅ POST user — 201 Created

❌ DELETE non-existent user — 404 Not Found

❌ PUT with invalid body — 500 Server Error

🧑‍💻 Author
Darya Ramirez
QA Automation Engineer | Java | Selenium | API | Allure | GitHub Actions
📧 LinkedIn www.linkedin.com/in/daryaramirez7

🏷️ Tags
#QA #APIautomation #RestAssured #TestNG #Allure #GitHubActions
