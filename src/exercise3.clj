(ns exercise3)

(defn fibonacci
	"Returns fibonacci number of X"
	[x]
	(if (< x 2) x (+ (fibonacci (- x 1)) (fibonacci (- x 2)))))