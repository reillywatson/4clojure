(fn ishappy
	([num] (ishappy num #{}))
	([num seen]
		(letfn  [
		(digits [num]
			(map #(Character/digit % 10) (str num)))
		(nextnum [num]
				(reduce + (map #(* % %) (digits num))))]
		(if (= 1 num) true
		(if (contains? seen num) false
		(ishappy (nextnum num) (conj seen num)))))))
