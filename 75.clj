(fn tot [x]
  (letfn [(divisors [n] (set (filter #(zero? (mod n %)) (range 1 (inc n)))))]
    (count (filter 
      #(= 1 
        (count 
          (clojure.set/intersection (divisors x) (divisors %))))
      (range 1 (inc x))))))
