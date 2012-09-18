(fn prime [n]
  (take n 
    (filter (fn p [x]
      (empty? (filter #(zero? (mod x %)) (range 2 x))))
    (range 2 Double/POSITIVE_INFINITY))))
