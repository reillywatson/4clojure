(fn sum [x]
  (if (empty? x)
    0
  (+ (first x) (sum (rest x)))))
