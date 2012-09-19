(defn gcd [args]
	(do
	(println args)
	(if (= (max args) (min args))
		(do (println "got it") (println (max args))
		(max args))
		(gcd (map 
			#(if (= % (min args))
				%
				(- % (min args)))
			args)))))