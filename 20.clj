(fn m [x] (if (= (count x) 2) (first x) (m (rest x))))
