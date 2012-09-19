(fn tree? [t]
	(or (nil? t)
		(and
			(coll? t)
			(= 3 (count t))
			(tree? (nth t 1))
			(tree? (nth t 2)))))