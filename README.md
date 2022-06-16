Giraffe

The solution consists of 2 major classes: a ```ZooIceCreamParlour``` class representing the shop, and a ```Product``` class representing one
product the shop offers.

The ```ZooIceCreamParlour``` class stores all the products in an HashMap instance variable where the key is a String 
name of the product, and the value is the ```Product``` object. A HashMap was chosen to ensure efficient price and promo lookup for a
particular product. The ```processOrders``` method takes in an order as an argument in a form of a HashMap, where the key is the String name,
and the value is the Integer amount ordered for that product. The method loops through each entry in the HashMap, and calculates the price
of that amount applying the promos at the same time.

The ```Product``` class has a flavour of type String, a price of type double, and a promo as instance variables which is a double array of size 2.
The first number is the amount need to be bought for the promo to apply, and the second number is the total price for that amount of product counting 
in the discount. These two numbers are calculated from 3 user inputs when defining a promo: the amount required to be bought for the promo to apply, 
the amount received additionally, and the percentage need to be paid for that additional amount. For example, if the user wants to apply the promo:
buy 4, get 3 at 1/4 price, the inputs would be 4, 3, 0.25. Assuming the prices are 10 ZDR, these numbers would then be converted into
a promo of buying 7 units 47.5 ZDR. This design ensures flexibility in entering promos while making it easy to calculate the cost of
total orders.

The assumptions:
* products never run out
* no negative prices
* no 'disadvantageous' promos (buy 1, get 1 at double price)
* no cross-product promos (buy 1 Rocky Road, get 1 Cookies & Cream free)
* user only cares about total amount to be paid and not the amount of discount received
* every product has to be paid in ZDR
* "Today's promo" applies to every day unless the user changes or deletes the promos
