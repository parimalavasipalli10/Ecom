import psycopg2
import json

try:
    conn = psycopg2.connect(
        host='burrow-sphinx-3280.7s5.cockroachlabs.cloud',
        dbname='ecommerce',
        port='26257',
        user='parimala',
        password='rvcbxTRId1lLnTgvf2gbCw'
    )
    print("Connected")

    cursor = conn.cursor()

    category = {
        'smartphones':1,
        'laptops':2,
        'fragrances':3,
        'skincare':4,
        'groceries':5,
        'home-decoration':6
    }

    with open(r'tools\products.json','r') as file:
        data = json.load(file)

        for product in data.get('products',[]):
            cursor.execute(
            "INSERT INTO products (product_id, product_availability , product_description, product_image,product_name,product_price, product_quantity, product_thumbnail, category_id ,seller_id) VALUES (%s,true,%s,%s,%s,%s,%s,%s,%s,1001)",
            (
                product.get("id"),
                product.get("description"),
                product.get("images", [])[0],  # Store images as JSON array
                product.get("title"),
                product.get("price"),
                product.get("stock"),
                product.get("thumbnail"),
                category[product.get('category')]
            )
        )
        conn.commit()
        
except Exception as e:
    print(e)