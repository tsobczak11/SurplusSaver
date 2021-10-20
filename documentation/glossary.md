# Glossary for database

## Entity #1 Name: farm

   - **Synonyms:** Distributor, Supplier, Provider
  
   - **Description:** A farm is the institution that is looking to provide others with their surplus product.
  
   - **Relationship(s):** Farm-Retrieves-Order 1(1)-M(1), farm-ShipsTo-Shipment M(1)-M(1)
   
   - **Attribute(s):** farm_id 1-1(1), order_id 1-M(1), transport_id 1-M(1)
   
   - **Dependent Entities and Dependency Relationships:** Master entity
   
   - **Supertypes, Subtypes, and Partitions:** Supertype entity
   
   - **Cascade and/or Restrict actions for Dependency Relationships:** Cascade on primary key update and delete
Restrict on foreign key insert and update
   
   - **Cascade and/or Restrict rules on Foreign Keys that implement Dependency Relationships:** Cascade on primary key update and delete
Restrict on foreign key insert and update
   
   - **Implementing Attribute Types:**
   
      - **Attribute Type:** id

      - **Data Type:** CHAR(4)

      - **Description:** 'id' is used for attributes with which label information with up to four
characters. Characters in id are either alphabetic or numeric. Punctuation is not allowed. Examples
are farm ids, such as AB12, and stock symbols, such as AAPL.
   
## Entity #2 Name: recipient

   - **Synonyms:** Consumer, Client, Receiver
   
   - **Description:** A recipient is the individual who is looking to receive the surplus product.
   
   - **Relationship(s):** Recipient-Places-Order M(1)-M(1)
   
   - **Attribute(s):** recipient_id 1-1(1), recipient_first_name M-M(1), recipient_first_name M-1(1), recipient_last_name M-1(1), recipient_address M-1(0), recipient_email_address M-1(1)
   
   - **Dependent Entities and Dependency Relationships:**
   
   - **Supertypes, Subtypes, and Partitions:** 
   
   - **Cascade and/or Restrict actions for Dependency Relationships:**
   
   - **Cascade and/or Restrict rules on Foreign Keys that implement Dependency Relationships:**
   
   - **Implementing Attribute Types:**
   
## Entity #3 Name: transport

   - **Synonyms:** Cargo, Freight, Shipment, Transfer
   
   - **Description:** Information on the product being shipped by the supplier.
   
   - **Relationship(s):** Transport-Delivers-Order M(1)-M(10
   
   - **Attribute(s):** transport_id 1-1(1), order_id 1-1(1), transport_date 1-1(1)
   
   - **Dependent Entities and Dependency Relationships:** Dependant entity, transport-BelongsTo-farm
   
   - **Supertypes, Subtypes, and Partitions:** Supertype entity
   
   - **Cascade and/or Restrict actions for Dependency Relationships:** Cascade on primary key update and delete. Restrict on foreign key insert and update.
   
   - **Cascade and/or Restrict rules on Foreign Keys that implement Dependency Relationships:** Cascade on primary key update and delete. Restrict on foreign key insert and update.
   
   - **Implementing Attribute Types:**
   
## Entity #4 Name: order

   - **Synonyms:** request, transaction
   
   - **Description:** Information on the product being given to recipients.
   
   - **Relationship(s):** Order-Creates-Shipment 1(1)-1(1)
   
   - **Attribute(s):** order_id 1-1(1), recipient_id 1-1(1), order_date date 1-1(1)
   
   - **Dependent Entities and Dependency Relationships:** Dependent entity, order-BelongsTo-farm
   
   - **Supertypes, Subtypes, and Partitions:** Supertype entity
   
   - **Cascade and/or Restrict actions for Dependency Relationships:** Cascade on primary key update and delete
Restrict on foreign key insert and update
   
   - **Cascade and/or Restrict rules on Foreign Keys that implement Dependency Relationships:** Cascade on primary key update and delete
Restrict on foreign key insert and update
   
   - **Implementing Attribute Types:**
   
      - **Attribute Type:** id

      - **Data Type:** CHAR(4)

      - **Description:** 'id' is used for attributes with which label information with up to four
characters. Characters in id are either alphabetic or numeric. Punctuation is not allowed. Examples
are farm ids, such as AB12, and stock symbols, such as AAPL.
   
      - **Attribute Type:** date

      - **Data Type:** DATE

      - **Description:** 'date' is used for attributes with which label information with a date requirement. Characters in date are in YYYY-MM-DD format.Any other punctuation is not allowed. Examples are farm 2018-04-28.
   
## Entity #5 Name: category

   - **Synonyms:** type, group, classification
   
   - **Description:** The type of crop and information about the crop
   
   - **Relationship(s):** Crop-Contains-Category
   
   - **Attribute(s):** category_id, type, category_name, category_description
   
   - **Dependent Entities and Dependency Relationships:**
   
   - **Supertypes, Subtypes, and Partitions:** 
   
   - **Cascade and/or Restrict actions for Dependency Relationships:**
   
   - **Cascade and/or Restrict rules on Foreign Keys that implement Dependency Relationships:**
   
   - **Implementing Attribute Types:**
   
## Entity #6 Name: crop

   - **Synonyms:** product, plant, food
   
   - **Description:** Group of cultivated plants or agricultural produce.
   
   - **Relationship(s):** Crop-Contains-Category
   
   - **Attribute(s):** crop_id, crop_name, crop_description, crop_category
   
   - **Dependent Entities and Dependency Relationships:** Dependant entity, crop-BelongsTo-order
   
   - **Supertypes, Subtypes, and Partitions:** Supertype entity
   
   - **Cascade and/or Restrict actions for Dependency Relationships:** Cascade on primary key update and delete. Restrict on foreign key insert and update.
   
   - **Cascade and/or Restrict rules on Foreign Keys that implement Dependency Relationships:** Cascade on primary key update and delete. Restrict on foreign key insert and update.
   
   - **Implementing Attribute Types:**
   
## Entity #7 Name: quantity

   - **Synonyms:** number, amount
   
   - **Description:** The amount of surplus crops from farms.
   
   - **Relationship(s):** quantity
   
   - **Attribute(s):** crop_id, quantity
   
   - **Dependent Entities and Dependency Relationships:**
   
   - **Supertypes, Subtypes, and Partitions:** 
   
   - **Cascade and/or Restrict actions for Dependency Relationships:**
   
   - **Cascade and/or Restrict rules on Foreign Keys that implement Dependency Relationships:**
   
   - **Implementing Attribute Types:**
   
## Entity #8 Name: location

   - **Synonyms:** area, spot, place
   
   - **Description:** The location describes where the farm is
   
   - **Relationship(s):** region-contains-farm (1)(1)-(1)(M)
   
   - **Attribute(s):** location_id (1)(1)-(1)(M), state (1)(1)-(1)(1), street (1)(1)-(1)(1), zipcode (1)(1)-(1)(1), country (1)(1)-(1)(1), climate (1)(m)-(1)(m)
   
   - **Dependent Entities and Dependency Relationships:**
   
   - **Supertypes, Subtypes, and Partitions:** 
   
   - **Cascade and/or Restrict actions for Dependency Relationships:**
   
   - **Cascade and/or Restrict rules on Foreign Keys that implement Dependency Relationships:**
   
   - **Implementing Attribute Types:**
 
## Entity #9 Name: available_surplus

   - **Synonyms:** over_inventory, quantity_available
   
   - **Description:** The inventory if crops available.
   
   - **Relationship(s):** available_surplus-takefrom-quantity (M)(M)-(M)(M), available_surplus-takes-crops (M)(M)-(M)(M)
   
   - **Attribute(s):** available_surplus_id (1)(1)-(1)(M), crop_id (1)(1)-(1)(M), quantity (M)(M)-(M)(M), 
   
   - **Dependent Entities and Dependency Relationships:**
   
   - **Supertypes, Subtypes, and Partitions:** 
   
   - **Cascade and/or Restrict actions for Dependency Relationships:**
   
   - **Cascade and/or Restrict rules on Foreign Keys that implement Dependency Relationships:**
   
   - **Implementing Attribute Types:**
   
