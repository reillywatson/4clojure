(fn c [x] (if (empty? x) 0 (+ 1 (c (rest x)))))
