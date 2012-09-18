(fn nodup [x]
  (if (empty? x)
    '()
  (if (= (first x) (first (rest x)))
    (nodup (rest x))
    (cons (first x) (nodup (rest x))))))
