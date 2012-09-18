(fn part [n s]
  (when (>= (count s) n)
    (cons (take n s) (part n (drop n s)))))
