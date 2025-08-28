
## 📌 Problems Implemented

### **Problem 1: Policy Application Process**
- **Class**: `PolicyApplication`
- **Functionality**:
  - Processes new insurance policy applications.
  - Validates user details:
    - **Age** → Throws `InvalidAgeException`.
    - **Driving History** → Throws `PoorDrivingRecordException`.
    - **Health Records** → Throws `HealthIssueException`.
- **Exception Handling**:
  - Checked exceptions are handled in `main` and logged for review.

---

### **Problem 2: Claim Processing System**
- **Class**: `ClaimProcessingSystem`
- **Functionality**:
  - Processes insurance claims.
  - Validates claim data:
    - Fraudulent claims → Throws `FraudulentClaimException`.
    - Invalid claim amounts → Throws `InvalidClaimAmountException`.
- **Exception Handling**:
  - Unchecked exceptions are caught in `main`.
  - Notifications sent to the claims department for investigation.

---

### **Problem 3: Premium Calculation**
- **Class**: `PremiumCalculator`
- **Functionality**:
  - Calculates premiums for various policies (Life, Health, Vehicle).
  - Fetches required data like age, health conditions, and vehicle type.
  - Performs premium calculations.
- **Exceptions Used**:
  - Missing data → `DataNotFoundException` (checked).
  - Calculation errors → `CalculationException` (unchecked).
- **Logging**:
  - Proper logging for troubleshooting and audit trails.

---

### **Problem 4: Insurance Policy Renewal**
- **Class**: `PolicyRenewal`
- **Functionality**:
  - Handles renewal of insurance policies.
  - Validates:
    - Policy status → `PolicyExpiredException`.
    - Payment history → `PaymentPendingException`.
    - Renewal terms → `NonComplianceException`.
- **Exception Handling**:
  - Checked exceptions are caught in `main`.
  - Policyholders are notified accordingly.

---

### **Problem 5: Customer Management System**
- **Class**: `CustomerManagementSystem`
- **Functionality**:
  - Manages customer records (add, update, delete).
  - Validates customer data and IDs.
- **Exceptions Used**:
  - Invalid Customer ID → `CustomerNotFoundException` (checked).
  - Invalid Data → `InvalidCustomerDataException` (unchecked).
- **Error Handling**:
  - Detailed error messages.
  - Logging for audit purposes.

---

## ⚙️ Technologies Used
- **Language**: Java (JDK 8+)
- **Core Concepts**:
  - Custom Checked & Unchecked Exceptions
  - Exception Handling (`try-catch-finally`, `throws`)
  - Logging & Notifications
- **Tools**:
  - IDE: Eclipse / IntelliJ / VS Code
  - Git for version control

---

## 🚀 How to Run the Project
1. Clone the repository:
   ```bash
   git clone <repo-url>
   cd InsuranceManagementSystem
2. Compile the Java files:
   ```bash
   javac *.java
3. Run the main file (contains demo for all problems):
   ```bash
   java Main
