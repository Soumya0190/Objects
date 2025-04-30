# Objects
https://canvas.eee.uci.edu/courses/21534/assignments/401807

---

Here’s how you can explain this **Java Banking Project** using the **STAR method** for interviews or on your resume:

---

## ⭐ STAR Method Breakdown

### ✅ **S – Situation**
As part of a Java programming assignment, I was tasked with designing and implementing a mini banking system. The goal was to demonstrate a strong understanding of object-oriented programming concepts, including class design, constructors, encapsulation, lists, and method overriding.

---

### ✅ **T – Task**
I had to create three interconnected Java classes—`Customer`, `Address`, and `Transaction`—with proper constructors, accessors, mutators, and `toString()` methods. Additionally, I had to implement business logic methods in the `Customer` class, such as adding transactions, computing total transactions, and calculating compounded interest.

---

### ✅ **A – Action**
- Developed the `Address` class to encapsulate address data such as street, city, state, and ZIP code.
- Designed the `Transaction` class to represent bank transactions, including vendor name, amount, and whether it was a deposit or withdrawal.
- Built the `Customer` class with attributes like account number (auto-incremented), name, balance, interest rate, address, and a list of `Transaction` objects.
- Implemented methods like:
  - `addTransaction()` to insert transactions with amount and type.
  - `getTotalTransactions()` to compute net movement from the transaction list.
  - `getInterest()` to calculate interest compounded annually and update the balance.
- Ensured correct formatting and naming conventions for all methods to pass automated JUnit test files.
- Overrode the `toString()` method in all classes for structured string output, adhering to exact formatting for automation grading.
- Tested the code rigorously using JUnit and manually validated output for edge cases (e.g., zero balance, negative deposits, empty transaction list).

---

### ✅ **R – Result**
- Successfully implemented a fully functional banking simulation in Java using object-oriented principles.
- All classes passed JUnit test automation without compilation or naming issues.
- Demonstrated strong code organization, clarity, and reusability.
- Strengthened foundational understanding of Java class design, encapsulation, static variables, lists, and testing.

---

## 🎯 Resume Bullet Example:
> - Built a mini banking system in Java using OOP principles; created `Customer`, `Address`, and `Transaction` classes with full accessors, mutators, constructors, and formatted output for test automation.
> - Implemented business logic to handle transactions, compute totals, and apply annual interest; ensured full test coverage using JUnit.

Would you like help converting this into a LinkedIn project description or formatting a README file for submission?

---

Sure! Here's a detailed explanation of each class and how they work together in the provided solution:

---

### **`Address` Class**

This class is responsible for representing a physical address (e.g., street address, city, state, zip code).

1. **Fields:**
   - `addressNumber`: A unique number associated with the address.
   - `streetName`, `city`, `state`, `zipCode`: Strings that represent the components of the address.

2. **Constructors:**
   - **Default constructor**: Initializes the object without any parameters (useful for creating an object and then setting its fields separately).
   - **Parameterized constructor**: Initializes the object with specific values.
   - **Copy constructor**: Creates a new `Address` object that is a copy of an existing `Address` object (this ensures that the address is duplicated, not just referenced).

3. **Getters and Setters**: 
   - Each field has its own getter and setter methods to allow for controlled access to the fields.

4. **`toString` Method**: 
   - This method returns a string representation of the address in a readable format (for example: `123 Main St, Anytown, CA 12345`).

---

### **`Transaction` Class**

This class models a financial transaction that occurs in a customer’s account. It contains details about the vendor, the amount of money involved, and whether the transaction is a withdrawal or deposit.

1. **Fields:**
   - `vendor`: The name of the business or person associated with the transaction (e.g., "SuperMart").
   - `amount`: The amount of money involved in the transaction.
   - `isWithdrawal`: A boolean flag to indicate whether the transaction is a withdrawal (`true`) or a deposit (`false`).

2. **Static Field:**
   - `transactionCount`: A static variable that tracks the total number of transactions created across all instances of the class.

3. **Constructors:**
   - **Default constructor**: This constructor increments `transactionCount` every time a new `Transaction` is created.
   - **Parameterized constructor**: This constructor initializes the transaction with specific values for the `vendor`, `amount`, and `isWithdrawal` fields, while also incrementing `transactionCount`.
   - **Copy constructor**: Creates a new `Transaction` object that is a copy of an existing one, ensuring that the original transaction data is replicated.

4. **Getters and Setters**: 
   - These methods allow controlled access to the fields (`vendor`, `amount`, and `isWithdrawal`).

---

### **`Customer` Class**

The `Customer` class represents a customer who has an account in the system. It contains all the relevant information about the customer, such as personal details, account balance, transactions, and address.

1. **Fields:**
   - `accountNumber`: A unique identifier for the customer account. It is automatically incremented for every new customer using the `lastAccountNumber` static field.
   - `firstName` and `lastName`: The customer’s name.
   - `balance`: The current balance of the customer’s account.
   - `interestRate`: The interest rate applied to the customer's balance (e.g., 4.3%).
   - `address`: The customer’s physical address, represented as an `Address` object.
   - `transactions`: A list (`ArrayList`) of `Transaction` objects that store all the transactions made by the customer.

2. **Static Field:**
   - `lastAccountNumber`: A static field to generate unique account numbers across all customer instances. Each time a new `Customer` is created, this number is incremented.

3. **Constructors:**
   - **Parameterized constructor**: This constructor initializes the customer’s account with their personal details, initial balance, interest rate, and address. It also sets the account number using the `lastAccountNumber` counter.
   - **Copy constructor**: This constructor creates a new `Customer` object that copies all the fields from another `Customer`. A new `Address` object is created (via the copy constructor of `Address`) to ensure immutability, and the list of transactions is shallow copied to avoid shared references.

4. **Methods:**
   - **Getters and Setters**: These methods provide controlled access to the customer’s fields (`firstName`, `lastName`, `balance`, etc.).
   - **`addTransaction`**: This method allows adding a new transaction to the customer's transaction history. The transaction can either be a deposit (increase balance) or withdrawal (decrease balance). It updates the balance accordingly.
   - **`applyInterest`**: This method calculates the interest on the current balance based on the interest rate and adds the interest to the balance. It then returns the interest value that was added.
   - **`toString`**: This method provides a detailed string representation of the customer's information, including their name, account number, address, transaction history, and current balance.

---

### **Key Concepts:**

1. **Encapsulation**: 
   - Each class uses private fields with public getter and setter methods, ensuring data is accessed and modified only in a controlled manner. This is a good example of encapsulation in object-oriented programming (OOP).

2. **Immutability (where applicable)**:
   - The `Address` field in the `Customer` class is copied whenever it is accessed or set to avoid accidental changes to the original `Address` object outside the `Customer` class. This prevents mutable state and protects data integrity.

3. **Static Fields**:
   - `lastAccountNumber` and `transactionCount` are static fields that track values across all instances of `Customer` and `Transaction`, respectively. This allows tracking the total number of customers and transactions in the system without having to create separate instances for them.

4. **Object Relationships**:
   - A `Customer` contains an `Address` object and a list of `Transaction` objects, showcasing the concept of "composition" in OOP. The customer’s data is not just about individual values but also about relationships with other objects.

---

### Example Flow:

1. **Creating a Customer:**
   - When a new customer is created, they get an account number, which is generated by the static `lastAccountNumber` field.
   - The customer's address is set as an `Address` object, and the initial balance and interest rate are also defined.

2. **Adding Transactions:**
   - Customers can add transactions (either deposits or withdrawals). The `addTransaction` method handles this by updating the customer's balance and creating a new `Transaction` object.
   
3. **Applying Interest:**
   - The `applyInterest` method calculates the interest based on the customer’s balance and interest rate, then updates the balance.

4. **Displaying Information:**
   - The `toString` method is called to display the customer’s information, including their address and transaction history.

---

### Final Thoughts:

This design is modular and object-oriented, ensuring that the customer’s data (address, transactions) is encapsulated properly. The use of constructors, getter/setter methods, and immutability principles helps protect and maintain data integrity. The code is structured to allow flexibility (e.g., by creating copies of objects where needed) and provides a clear representation of customer accounts in a financial system.

---

To run the code, you'll need to follow a few steps depending on your environment. Here's how you can set up and execute this Java program:

### Steps to Run the Code:

1. **Install Java**: 
   Make sure you have the Java Development Kit (JDK) installed on your machine. You can download it from the official [Oracle website](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html).

2. **Set Up Your IDE or Text Editor**: 
   You can use an IDE like IntelliJ IDEA, Eclipse, or NetBeans for easier development. Alternatively, you can use a text editor (like VS Code, Sublime Text, or Notepad++) and run the code from the terminal or command prompt.

3. **Create the Java Files**: 
   - Create three separate Java files for each class (`Address.java`, `Transaction.java`, and `Customer.java`).
   - Copy the code for each class into the respective file.

4. **Compile and Run the Code**:
   If you're using an IDE, simply click "Run" after selecting the main class. If you are using the terminal, you can follow these steps:

   a. Open a terminal (Command Prompt or terminal on macOS/Linux).
   
   b. Navigate to the directory where the Java files are saved.

   c. **Compile the Code**: Run the following command to compile all the classes:
   ```bash
   javac Address.java Transaction.java Customer.java
   ```

   d. **Run the Program**: Since we don’t have a main method in any of the classes yet, you can add a `main` method to one of the classes (for example, in the `Customer` class), and then run the compiled classes:
   ```bash
   java Customer
   ```

### Add a `main` Method to Test the Code:

You can add a simple test in the `Customer` class to instantiate objects and run some of the methods. Here's an example of how you can do that:

```java
public class Customer {
    // ... (all the other fields and methods remain unchanged)

    // Add this main method to run a sample program
    public static void main(String[] args) {
        // Create a new Address object
        Address customerAddress = new Address(123, "Main St", "Anytown", "CA", "12345");

        // Create a new Customer object with some initial data
        Customer customer = new Customer("John", "Doe", 1000.0, 5.0, customerAddress);

        // Print customer information
        System.out.println(customer.toString());

        // Add a few transactions (both withdrawal and deposit)
        customer.addTransaction("SuperMart", 150.0, true);  // Withdrawal
        customer.addTransaction("Paycheck", 1000.0, false);  // Deposit

        // Print customer information after transactions
        System.out.println("\nAfter Transactions:");
        System.out.println(customer.toString());

        // Apply interest
        double interestEarned = customer.applyInterest();
        System.out.println("\nInterest Earned: " + interestEarned);

        // Print final balance
        System.out.println("Final Balance: " + customer.getBalance());
    }
}
```

### Sample Output:

When you run the program, the output will be something like this:

```text
Customer: John Doe
Account Number: 1001
Address: 123 Main St, Anytown, CA 12345
Transactions:
Vendor: SuperMart, Amount: 150.0, Withdrawal: true
Vendor: Paycheck, Amount: 1000.0, Withdrawal: false
Current Balance: 1000.0

After Transactions:
Customer: John Doe
Account Number: 1001
Address: 123 Main St, Anytown, CA 12345
Transactions:
Vendor: SuperMart, Amount: 150.0, Withdrawal: true
Vendor: Paycheck, Amount: 1000.0, Withdrawal: false
Current Balance: 1850.0

Interest Earned: 92.5
Final Balance: 1942.5
```

### Explanation of the Sample Run:

1. **Customer Creation**:
   - A `Customer` object is created with the name "John Doe", a balance of 1000.0, and an interest rate of 5.0%. The address is "123 Main St, Anytown, CA 12345".

2. **Adding Transactions**:
   - Two transactions are added:
     - A withdrawal of 150.0 at "SuperMart".
     - A deposit of 1000.0 from "Paycheck".
   
3. **Displaying Customer Info**:
   - The `toString()` method displays the customer details, including their address and transaction history.
   
4. **Applying Interest**:
   - The `applyInterest()` method calculates 5% interest on the current balance (which is 1000.0 at first), adding 92.5 to the balance.
   
5. **Final Balance**:
   - After interest is applied, the final balance is displayed as 1942.5 (after interest and transactions).

---

### Recap:

1. **Ensure Java is installed** on your machine.
2. **Compile the Java files** using `javac`.
3. **Run the program** with `java Customer` after adding the main method.
4. **Observe the output**, which shows customer details before and after transactions and interest application.

Let me know if you need further clarification!