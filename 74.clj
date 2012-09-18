(fn sq [s] 
  (let [nums (map #(. Integer (parseInt %)) (.split s ","))]
    (apply str (interpose "," (filter #(= 
      (. Math (sqrt %) )
      (. Math (floor (. Math (sqrt %))))) nums)))))
