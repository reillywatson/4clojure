(fn lcm [& args]
	(letfn [(gcd [& rest]
		(let [smallest (apply min rest) largest (apply max rest)]
			(if (= smallest largest)
				largest
				(apply gcd (map #(if (= % smallest) % (- % smallest)) rest)))))]
	(reduce (fn [x y] (/ (* x y) (gcd x y))) args)))