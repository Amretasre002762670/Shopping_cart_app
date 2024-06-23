# Shopping Cart Application

## Overview

This Shopping Cart Application is a web-based solution developed using Java Servlets and JSP. The application allows users to browse items, add them to a cart, and manage their shopping cart. It also includes a simple login mechanism.

## Features

- **User Authentication**: Login functionality to access the shopping cart.
- **Item Management**: Browse available items and add them to the shopping cart.
- **Shopping Cart**: View and manage items in the cart.
- **Error Handling**: Proper error handling and user-friendly error pages.

## Technologies Used

- **Backend**: 
  - Java Servlets
- **Frontend**: 
  - JSP (JavaServer Pages)
- **Model**: 
  - POJO class for representing items
- **Build Tool**: 
  - Apache Maven

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Apache Tomcat 9 or any other compatible servlet container
- Maven 3.6+
- An IDE like IntelliJ IDEA or Eclipse

### Installation

1. **Clone the Repository**

   ```bash
   git clone https://github.com/yourusername/shopping-cart-app.git
   cd shopping-cart-app
   ```

2. **Build the Project**

   ```bash
   mvn clean install
   ```

3. **Deploy to Tomcat**

   - Copy the generated WAR file from the `target` directory to the `webapps` directory of your Tomcat installation.
   - Start Tomcat server.

4. **Access the Application**

   Open your browser and navigate to `http://localhost:8080/shopping-cart-app`.

## Directory Structure

```
shopping-cart-app/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── webtools/
│   │   │           └── ShoppingCartApp/
│   │   │               ├── model/
│   │   │               │   └── Item.java
│   │   │               ├── servlets/
│   │   │               │   ├── LoginServlet.java
│   │   │               │   └── ShoppingCartServlet.java
│   │   ├── webapp/
│   │   │   ├── WEB-INF/
│   │   │   │   └── web.xml
│   │   │   ├── CartPage.jsp
│   │   │   ├── ErrorPage.jsp
│   │   │   ├── LoginPage.jsp
│   │   │   └── index.jsp
├── .gitignore
├── pom.xml
└── README.md
```

## Key Components

### Model

- **Item.java**: This class represents an item in the shopping cart.

### Servlets

- **LoginServlet.java**: Handles user login functionality.
- **ShoppingCartServlet.java**: Manages the shopping cart, including adding and removing items.

### JSP Files

- **CartPage.jsp**: Displays the items in the shopping cart.
- **ErrorPage.jsp**: Shows error messages.
- **LoginPage.jsp**: Provides the login form.
- **index.jsp**: The main landing page of the application.

## Configuration

### `web.xml`

The `web.xml` file located in `src/main/webapp/WEB-INF/` defines the servlet mappings and other configurations for the application.

## Contributing

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -am 'Add new feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Create a new Pull Request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

