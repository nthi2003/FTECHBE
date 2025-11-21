# FTech Backend 

## 📁 Project Structure

```plaintext
FTechBE/
├── module-auth/        # Authentication & Authorization
├── module-dmdc/        # Data Management & Data Collection
├── module-qtht/        # System Administration
├── module-server/      # Main Application Server
└── pom.xml             # Parent POM
```

# Cấu trúc 1 module
```plaintext
module-name/
├── src/
│   └── main/
│       └── java/
│           └── org/ftech/
│               ├── controller/        # API Controllers
│               ├── service/           # Business Logic
│               │   └── impl/          # Service Implementations
│               ├── repository/        # JPA Repositories
│               ├── entity/            # Entity Models
│               └── config/            # Module Configurations
│                   └── SecurityConfig.java
└── pom.xml                             # Module-level POM
```

