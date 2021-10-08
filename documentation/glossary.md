# Glossary for database

## Entity #1 Name: farm

   - **Synonyms:** Distributor, Supplier, Provider
  
   - **Description:** A farm is the institution that is looking to provide others with their surplus product.
  
   - **Relationship(s):** Farm-Retrieves-Order 1(1)-M(1), farm-ShipsTo-Shipment M(1)-M(1)
   
   - **Attribute(s):** farm_id 1-1(1), order_id 1-M(1), transport_id 1-M(1)

## Entity #2 Name: recipient

   - **Synonyms:** Consumer, Client, Receiver
   
   - **Description:** A recipient is the individual who is looking to purchase the surplus product.
   
   - **Relationship(s):** Recipient-Places-Order M(1)-M(1)
   
   - **Attribute(s):** recipient_id 1-1(1), recipient_first_name M-M(1), recipient_first_name M-1(1), recipient_last_name M-1(1), recipient_address M-1(0), recipient_email_address M-1(1)
   
## Entity #3 Name: transport

   - **Synonyms:** Cargo, Freight, Shipment, Transfer
   
   - **Description:** Information on the product being shipped by the supplier.
   
   - **Relationship(s):** Transport-Delivers-Order M(1)-M(10
   
   - **Attribute(s):** transport_id 1-1(1), order_id 1-1(1), transport_date 1-1(1)
   
## Entity #4 Name: order

   - **Synonyms:** request, transaction
   
   - **Description:** Information on the product being given to recipients.
   
   - **Relationship(s):** Order-Creates-Shipment 1(1)-1(1)
   
   - **Attribute(s):** order_id 1-1(1), recipient_id 1-1(1), order_date date 1-1(1)
   
## Entity #5 Name: category

   - **Synonyms:** type, group, classification
   
   - **Description:** The type of crop and information about the crop
   
   - **Relationship(s):** 
   
   - **Attribute(s):**
   
## Entity #6 Name: crop

   - **Synonyms:** plant, food
   
   - **Description:** 
   
   - **Relationship(s):** 
   
   - **Attribute(s):**
   
## Entity #7 Name: quantity

   - **Synonyms:** number, amount
   
   - **Description:** The amount of surplus crops from farms.
   
   - **Relationship(s):** 
   
   - **Attribute(s):**
   
## Entity #8 Name: location

   - **Synonyms:** area, spot, place
   
   - **Description:** A region is a area that holds farms.
   
   - **Relationship(s):** region-contains-farm (1)(1)-(1)(M)
   
   - **Attribute(s):** region_id (1)(1)-(1)(M) geographic_location (1)(1)-(1)(1) climate (1)(m)-(1)(m)
 
## Entity #9 Name: available_surplus

   - **Synonyms:** over_inventory, quantity_available
   
   - **Description:** The inventory if crops available.
   
   - **Relationship(s):** available_surplus-takefrom-quantity (M)(M)-(M)(M), available_surplus-takes-crops (M)(M)-(M)(M)
   
   - **Attribute(s):** available_surplus_id (1)(1)-(1)(M), crop_id (1)(1)-(1)(M), quantity (M)(M)-(M)(M), 
   
