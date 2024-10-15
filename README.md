<h1 align="center" id="title">Spring POS API</h1>

<p id="description">The Spring POS API is a comprehensive Point of Sale system built using the Spring Framework to manage customer data items and orders in a real-time retail environment. It enables efficient sales transactions inventory tracking and customer management with robust data handling via Spring Data JPA and Hibernate ORM. Designed for flexibility and scalability this API supports seamless integration with various front-end systems and offers well-documented RESTful endpoints for easy customization and extension making it an ideal solution for small to medium-sized businesses.</p>

  
  
<h2>🧐 Features</h2>

Here're some of the project's best features:

*   Manage customers items and orders.
*   Real-time inventory management.
*   Order creation with payment methods (cash/card/mobile).
*   Database: MySQL with Hibernate ORM.
*   Exception handling and validation using Spring Validator.
*   REST API with JSON responses.

<h2>🛠️ Installation Steps:</h2>

<p>1. Clone the Repository</p>

```
git clone https://github.com/sandundil2002/Spring_POS_API.git
```

<p>2. Build and Run the Application</p>

```
mvn clean install
```

<p>3. The application will start on</p>

```
http://localhost:8080
```

<h2>API Endpoints</h2> 

<h3>Customer Endpoints</h3>

  * GET /customer: Retrieve all customers.
  * POST /customer: Create a new customer.
  * PUT /customer: Update an existing customer.
  * DELETE /customer/{id}: Delete a customer by ID.

<h3>Item Endpoints</h3>

  * GET /item: Retrieve all items.
  * POST /item: Create a new item.
  * PUT /item: Update an existing item.
  * DELETE /item/{id}: Delete an item by ID.

<h3>Order Endpoints</h3>

  * POST /order: Create a new order.
  
<h2>💻 Built with</h2>

Technologies used in the project:

*   Spring- Backend framework in java
*   Hibernate- ORM for database interaction
*   Spring Data JPA- Data repository layer
*   MySQL- Database
*   Lombok- To reduce boilerplate code

<h2> API Documentation </h2>

* You can view the detailed API documentation with example requests and responses <a href="https://documenter.getpostman.com/view/35384990/2sAXxQfCXa">here</a>.

<h2>🛡️ License:</h2>

This project is licensed under the MIT License - see the LICENSE file for details.
