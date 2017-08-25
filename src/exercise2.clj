(ns exercise2)
	
(defn greater-than-five?
	"Returns true if x is greater than five"
	[x]
	(> x 5))
		
(defn only-greater-than-five
	"Filters numbers which are less or equal than 5"
	[lista]
	(filter greater-than-five? lista))