# Order Microservice API

This is a RESTful API service for managing orders in an e-commerce system. The service is built using Spring Boot and MongoDB.

## API Endpoints

### Redirect to Swagger UI
- **URL:** `/`
- **Method:** GET
- **Description:** Redirects to the Swagger UI documentation page

### Get All Orders
- **URL:** `/orders`
- **Method:** GET
- **Description:** Retrieves all orders from the database
- **Response:** List of OrderServiceData objects

### Create New Order
- **URL:** `/order`
- **Method:** POST
- **Description:** Creates a new order
- **Request Body:** OrderServiceData object
- **Response:** Created OrderServiceData object

### Get Orders by Username
- **URL:** `/orders/username/{username}`
- **Method:** GET
- **Description:** Retrieves all orders for a specific username using MongoDB pipeline
- **Parameters:** 
  - `username` (path parameter)
- **Response:** List of OrderServiceData objects

### Get Top 4 Best-Selling Products
- **URL:** `/orders/bestsales`
- **Method:** GET
- **Description:** Retrieves the top 4 most sold products based on quantity
- **Response:** List of TopSalesData objects

## Cross-Origin Resource Sharing (CORS)
This API supports CORS with all origins (`*`).

## Documentation
The API is documented using Swagger UI. You can access the documentation by navigating to the root URL (`/`), which will redirect you to `/swagger-ui.html`.

## Data Models

### OrderServiceData
Represents an order in the system. (Detailed structure to be implemented)

### TopSalesData
Represents the sales statistics for products. (Detailed structure to be implemented)

## Dependencies
- Spring Boot
- Spring Web
- MongoDB
- Springfox Swagger UI

## Setup and Configuration
1. Clone the repository:
   ```sh
   git clone https://github.com/RealChAuLa/OrderMicroService.git
2. Navigate to the project directory:
   ```sh
   cd OrderMicroService
3. Build the project using Maven:
   ```sh
   mvn clean install
4. Run the application:
   ```sh
   mvn spring-boot:run
