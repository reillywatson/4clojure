(defn partial-flatten [s]
	(if (coll? s)
		(map partial-flatten s)
		s))