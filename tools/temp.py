import requests
import json

req = requests.get('https://dummyjson.com/products')
# print(req.text)
data = req.json()
# print(data)
with open(r'tools\products.json','w') as file:
    json.dump(data, file, indent=4)
file.close()

