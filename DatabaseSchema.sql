-- Create the 'users' table
CREATE TABLE users (
    user_ID SERIAL PRIMARY KEY,
    user_name VARCHAR(255),
    user_firstname VARCHAR(255),
    user_lastname VARCHAR(255),
    user_Email VARCHAR(255),
    user_phonenumber VARCHAR(20),
    user_password VARCHAR(255) -- Added 'user_password' field
);

-- Create the 'sellers' table
CREATE TABLE sellers (
    seller_ID SERIAL PRIMARY KEY,
    seller_name VARCHAR(255),
    seller_password VARCHAR(255),
    seller_businessName VARCHAR(255),
    sellerEmail VARCHAR(255),
    seller_phonenumber VARCHAR(20)
);

-- Create the 'category' table
CREATE TABLE category (
    category_ID SERIAL PRIMARY KEY,
    category_name VARCHAR(255)
);

-- Create the 'products' table
CREATE TABLE products (
    product_ID SERIAL PRIMARY KEY,
    seller_ID INT REFERENCES sellers(seller_ID),
    category_ID INT REFERENCES category(category_ID), -- Added foreign key to 'category' table
    product_name VARCHAR(255),
    product_price DECIMAL(10, 2),
    product_image TEXT,
    product_thumbnail TEXT,
    product_availability BOOLEAN,
    product_quantity INT, -- Added 'product_quantity' field
    product_description TEXT -- Added 'product_description' field
);


-- Create the 'orders' table
CREATE TABLE orders (
    order_ID SERIAL PRIMARY KEY,
    user_ID INT REFERENCES users(user_ID),
    seller_ID INT REFERENCES sellers(seller_ID), -- Added 'seller_ID' field
    order_amount DECIMAL(10, 2),
    order_status VARCHAR(255),
    order_date DATE
);

-- Create the 'orderItems' table
CREATE TABLE orderItems (
    orderItem_ID SERIAL PRIMARY KEY,
    order_ID INT REFERENCES orders(order_ID),
    product_ID INT REFERENCES products(product_ID),
    product_quantity INT,
    product_cost DECIMAL(10, 2)
);

-- Create the 'cart' table
CREATE TABLE cart (
    cart_ID SERIAL PRIMARY KEY,
    user_ID INT REFERENCES users(user_ID),
    total_amount DECIMAL(10, 2), -- Added 'total_amount' field
    number_of_items INT
);

-- Create the 'cartItems' table
CREATE TABLE cartItems (
    cartItem_ID SERIAL PRIMARY KEY,
    cart_ID INT REFERENCES cart(cart_ID),
    product_ID INT REFERENCES products(product_ID),
    quantity INT,
    product_cost DECIMAL(10, 2)
);

-- Create the 'address' table
CREATE TABLE address (
    address_ID SERIAL PRIMARY KEY,
    user_ID INT REFERENCES users(user_ID),
    name VARCHAR(255),
    phone_number VARCHAR(20),
    number VARCHAR(10),
    street_name VARCHAR(255),
    area VARCHAR(255),
    district VARCHAR(255),
    pin_code VARCHAR(10)
);
