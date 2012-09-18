(fn m [x] (if (= (count x) 1) (first x) (m (rest x))))
