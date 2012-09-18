(fn gcd [a,b]
  (apply max 
    (filter 
      #(and (zero? (mod a %)) (zero? (mod b %)))
      (range 1 (inc (min a b))))))
