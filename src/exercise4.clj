(ns exercise4)

(defn summary
	"Returns sum of numbers in a collection"
	[collection]
	(reduce + 0 collection))