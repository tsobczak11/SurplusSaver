# Glossary for database

Entity #1 Name: farm

   Synonyms: Distributor, Supplier, Providor
  
   Description: A farm is the individual who is looking to provide other with their surplus product.
  
   Relationship(s): Farm-Retrieves-Order M(1)-M(1), farm-ShipsTo-Shipment M(1)-M(1)
   
   Attribute(s): farm 1-1(1), order_id 1-M(1), transport_id 1-M(1)

Entity #2 Name: recipient

   Synonyms: Consumer, Purchaser, Client, Customer
   
   Description: A recipient is the individual who is looking to purchase the surplus product.
   
   Relationship(s): Recipient-Places-Order M(1)-M(1)
   
   Attribute(s): recipient_id 1-1(1), recipient_first_name M-M(1), recipient_first_name M-1(1), recipient_last_name M-1(1), recipient_address M-1(0), recipient_email_address M-1(1)
   
Entity #3 Name: transport

   Synonyms: Cargo, Freight, Shipment
   
   Description: Information on the product being shipped by the supplier.
   
   Relationship(s): Transport-Delivers-Order M(1)-M(10
   
   Attribute(s): transport_id 1-1(1), order_id 1-1(1), transport_date 1-1(1)
   
Entity #4 Name: Order

   Synonyms: Application
   
   Description: Information on the product being bought by the customer.
   
   Relationship(s): Order-Creates-Shipment 1(1)-1(1)
   
   Attribute(s): order_id 1-1(1), recipient_id 1-1(1), order_date date 1-1(1)
   
Entity #5 Name: order_item

   Synonyms: 
   
   Description: 
   
   Relationship(s): 
   
   Attribute(s):
   
Entity #6 Name: crop

   Synonyms: 
   
   Description: 
   
   Relationship(s): 
   
   Attribute(s):
   
Entity #7 Name: quantity

   Synonyms: 
   
   Description: 
   
   Relationship(s): 
   
   Attribute(s):
   
Entity #8 Name: region

   Synonyms: 
   
   Description: 
   
   Relationship(s): 
   
   Attribute(s):
 
Entity #9 Name: available_surplus

   Synonyms: 
   
   Description: 
   
   Relationship(s): 
   
   Attribute(s):
   
Entity #9 Name: category

   Synonyms: 
   
   Description: 
   
   Relationship(s): 
   
   Attribute(s):
