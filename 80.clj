(fn [x] (letfn 
  [(divisors [n]
    (filter #(zero? (mod x %)) (range 1 n)))]
  (= (reduce + (divisors x)) x)))

