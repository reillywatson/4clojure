(fn read_binary [x]
  (letfn [(convert [digit x]
    (if (= x 0) 0 (int (Math/pow 2 digit))))]
  (reduce + 0 (map-indexed convert (map #(Character/digit % 10) (reverse x))))))
