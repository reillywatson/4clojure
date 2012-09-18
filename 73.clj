(fn an [board] (let [vic (first (first (filter #(= (count %) 1) (map distinct 
  (concat (list
    (map first board)
    (map second board)
    (map #(nth % 2) board)
    (map-indexed #(nth %2 %) board)
    (map-indexed #(nth %2 (- 2 %)) board)) board)))))] (if (= vic :e) nil vic)))
