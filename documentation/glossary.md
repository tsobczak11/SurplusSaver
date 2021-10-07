# Glossary for database

Entity #1 Name: supplier

   Synonyms: Distributor, Providor
  
   Description: A supplier is the individual who is looking to provide other with their surplus product.
  
   Relationship(s): Supplier-Retrieves-Order M(1)-M(1), Supplier-ShipsTo-Shipment M(1)-M(1)
   
   Attribute(s): supplier_id 1-1(1), order_id 1-M(1), shipment_id 1-M(1)

Entity #2 Name: customer

   Synonyms: Consumer, Purchaser, Client
   
   Description: A customer is the individual who is looking to purchase the surplus product.
   
   Relationship(s): Customer-Places-Order M(1)-M(1)
   
   Attribute(s): customer_id 1-1(1), customer_first_name M-M(1), customer_first_name M-1(1), customer_last_name M-1(1), customer_address M-1(0), customer_email_address M-1(1)
   
Entity #3 Name: shipment

   Synonyms: Cargo, Freight
   
   Description: Information on the product being shipped by the supplier.
   
   Relationship(s): 
   
   Attribute(s): shipment_id 1-1(1), order_id 1-1(1), shipment_date 1-1(1)
   
Entity #4 Name: Order

   Synonyms: Cargo, Freight
   
   Description: Information on the product being shipped by the supplier.
   
   Relationship(s): Order-Create-Shipment 1(1)-1(1)
   
   Attribute(s): order_id 1-1(1), customer_id 1-1(1), order_date date 1-1(1)
   
Entity #5 Name: 

   Synonyms: 
   
   Description: 
   
   Relationship(s): 
   
   Attribute(s):
   
Entity #6 Name: 

   Synonyms: 
   
   Description: 
   
   Relationship(s): 
   
   Attribute(s):
   
Entity #7 Name: 

   Synonyms: 
   
   Description: 
   
   Relationship(s): 
   
   Attribute(s):
   
Entity #8 Name: 

   Synonyms: 
   
   Description: 
   
   Relationship(s): 
   
   Attribute(s):
 
Entity #9 Name: 

   Synonyms: 
   
   Description: 
   
   Relationship(s): 
   
   Attribute(s):
   
