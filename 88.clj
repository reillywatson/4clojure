; easiest way
(fn symmetric-difference [a b]
	(clojure.set/union (clojure.set/difference a b) (clojure.set/difference b a)))
	
; doesn't rely on difference being a set operator
(defn xor [a b] (and (or a b) (not (and a b))))
(defn symmetric-difference [a b]
	(filter #(xor (contains? a %) (contains? b %)) (clojure.set/union a b)))