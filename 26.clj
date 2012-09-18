(fn fib [x]
  (if (= x 1)
   [1]
  (if (= x 2)
    [1 1]
  (let [prev (fib (- x 1))]
    (conj prev (+ 
      (nth prev (- (count prev) 1))
      (nth prev (- (count prev) 2))))))))
