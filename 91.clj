(defn neighbours [graph vertex]
	(filter #(not= % vertex) (set (mapcat identity (filter (fn [a] (some #(= % vertex) a)) graph)))))
